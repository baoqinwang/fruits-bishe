package com.zzti.fruits.service.iml;

//import com.alibaba.dubbo.config.annotation.Service;
//import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.GoodsMapper;
import com.zzti.fruits.mapper.StockInfoMapper;
import com.zzti.fruits.pojo.Goods;
import com.zzti.fruits.pojo.GoodsExample;
import com.zzti.fruits.pojo.StockInfo;
import com.zzti.fruits.service.GoodsService;
import com.zzti.fruits.util.DateUtils;
import com.zzti.fruits.util.SnowflakeComponent;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private SnowflakeComponent snowflakeComponent;
	@Autowired
	private StockInfoMapper stockInfoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Goods> findAll() {
		return goodsMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		Page<Goods> page=   (Page<Goods>) goodsMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}


	/**
	 * 增加
	 */
	@Override
	@Transactional
	public void add(Goods goods) {
       goods.setGoodno(String.valueOf(snowflakeComponent.getInstance().nextId()));
      goods.setDelstatus("0");
		goods.setSavetime(DateUtils.DT_DAY()+" "+DateUtils.times());
		updateShelfTime(goods);
		if(!"[]".equals(goods.getImgurl())) {
			JSONArray json = (JSONArray) JSONArray.parse(goods.getImgurl());
			goods.setFilename1(((JSONObject)json.get(0)).getString("url"));
		}
       goodsMapper.insert(goods);
       //像库存插入记录
		StockInfo stockInfo=new StockInfo();
		stockInfo.setGoodsId(goods.getId().toString());
		stockInfo.setStockCount(0);
		stockInfo.setHoldCount(0);
		stockInfo.setMinStockCount(0);
		stockInfo.setCrtTlr("admin");
		stockInfo.setCrtTm(new Date());
		stockInfoMapper.insert(stockInfo);


	}

	/**
	 * 根据上架状态修改上下架时间
	 * @param goods
	 */
	private void updateShelfTime(Goods goods){
		if("00".equals(goods.getIsshelf())&&(goods.getShelfbegin()==null||"".equals(goods.getShelfbegin())))
			goods.setShelfbegin(DateUtils.DT_DAY()+" "+DateUtils.times());
		if("01".equals(goods.getIsshelf())&&(goods.getShelfend()==null||"".equals(goods.getShelfend())))
			goods.setShelfend(DateUtils.DT_DAY()+" "+DateUtils.times());
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Goods goods){
		updateShelfTime(goods);
		System.out.println(StringUtils.isNotBlank(goods.getImgurl()));
		if(!"[]".equals(goods.getImgurl())&&StringUtils.isNotBlank(goods.getImgurl())) {
			JSONArray json = (JSONArray) JSONArray.parse(goods.getImgurl());
			goods.setFilename1(((JSONObject)json.get(0)).getString("url"));
		}

		goodsMapper.updateByPrimaryKeySelective(goods);
		
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Goods findOne(Long id){

		return  goodsMapper.selectByPrimaryKey(id.intValue());
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			Goods goods=new Goods();
			goods.setId(id.intValue());
			goods.setDelstatus("1");
			goodsMapper.updateByPrimaryKeySelective(goods);
		}
	}
	
	
		@Override
	public PageResult findPage(Goods goods, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
//
		GoodsExample example=new GoodsExample();
		GoodsExample.Criteria criteria = example.createCriteria();
		if(goods!=null){
			if(StringUtils.isNotBlank(goods.getGoodname())){
				criteria.andGoodnameLike("%"+goods.getGoodname()+"%");
			}
			if(StringUtils.isNotBlank(goods.getFid())){
				criteria.andFidEqualTo(goods.getFid());
			}
			if(StringUtils.isNotBlank(goods.getSid())){
				criteria.andSidEqualTo(goods.getSid());
			}
		}
		criteria.andDelstatusEqualTo("0");
		example.setOrderByClause("savetime DESC");
		Page<Goods> page= (Page<Goods>)goodsMapper.selectByExample(example);
		return new PageResult(page.getTotal(), page.getResult());
	}



	@Override
	public void updateShelf(Goods goods) {
         if("00".equals(goods.getIsshelf()))
         	  goods.setShelfbegin(DateUtils.DT_DAY()+" "+DateUtils.times());
         else if("01".equals(goods.getIsshelf()))
         	goods.setShelfend(DateUtils.DT_DAY()+" "+DateUtils.times());
         goodsMapper.updateByPrimaryKeySelective(goods);
	}

}
