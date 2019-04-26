package com.zzti.fruits.service.iml;
import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.DddetailMapper;
import com.zzti.fruits.pojo.Dddetail;
import com.zzti.fruits.pojo.DddetailExample;
import com.zzti.fruits.pojogroup.GroupDdDet;
import com.zzti.fruits.service.DddetailService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class DddetailServiceImpl implements DddetailService {

	@Autowired
	private DddetailMapper dddetailMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Dddetail> findAll() {
		return dddetailMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Dddetail> page=   (Page<Dddetail>) dddetailMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Dddetail dddetail) {
		dddetailMapper.insert(dddetail);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Dddetail dddetail){
		dddetailMapper.updateByPrimaryKey(dddetail);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Dddetail findOne(Long id){
		return dddetailMapper.selectByPrimaryKey(id.intValue());
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			dddetailMapper.deleteByPrimaryKey(id.intValue());
		}		
	}
	
	
		@Override
	public PageResult findPage(Dddetail dddetail, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
			List<GroupDdDet> list = dddetailMapper.Search(dddetail.getDdno());
			for (GroupDdDet item:
				 list) {
				//取出第一张图片返回
				if(!"[]".equals(item.getImgurl())&&StringUtils.isNotBlank(item.getImgurl())) {
					JSONArray dataJson = (JSONArray) JSONArray.parse(item.getImgurl());
					if(!(dataJson == null || dataJson.isEmpty()  || "null".equals(dataJson)))
						item.setImgurl(((JSONObject)dataJson.get(0)).getString("url"));
				}
				//计算总金额
				if(StringUtils.isNotBlank(item.getNum())&&StringUtils.isNotBlank(item.getPrice())){
					item.setTotalMoney(Double.parseDouble(item.getPrice())*Integer.parseInt(item.getNum())+"");
				}
			}

			Page<GroupDdDet> page= (Page<GroupDdDet>)list;
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public List<GroupDdDet> searchDet(String ddno) {
		if(StringUtils.isNotBlank(ddno))
		{
			List<GroupDdDet> list = dddetailMapper.Search(ddno);
			for (GroupDdDet item:
					list) {
				//取出第一张图片返回
				if(!"[]".equals(item.getImgurl())&&StringUtils.isNotBlank(item.getImgurl())) {
					JSONArray dataJson = (JSONArray) JSONArray.parse(item.getImgurl());
					if(!(dataJson == null || dataJson.isEmpty()  || "null".equals(dataJson)))
						item.setImgurl(((JSONObject)dataJson.get(0)).getString("url"));
				}
				//计算总金额
				if(StringUtils.isNotBlank(item.getNum())&&StringUtils.isNotBlank(item.getPrice())){
					item.setTotalMoney(Double.parseDouble(item.getPrice())*Integer.parseInt(item.getNum())+"");
				}
			}
            return list;
		}
		return null;
	}

}
