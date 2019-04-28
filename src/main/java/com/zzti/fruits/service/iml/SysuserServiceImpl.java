package com.zzti.fruits.service.iml;
import java.util.List;

import com.zzti.fruits.entity.PageResult;
import com.zzti.fruits.mapper.SysuserMapper;
import com.zzti.fruits.pojo.Sysuser;
import com.zzti.fruits.pojo.SysuserExample;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import com.zzti.fruits.service.SysuserService;
import org.springframework.stereotype.Service;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class SysuserServiceImpl implements SysuserService {

	@Autowired
	private SysuserMapper sysuserMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<Sysuser> findAll() {
		return sysuserMapper.selectByExample(null);
	}

	/**
	 * 按分页查询
	 */
	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<Sysuser> page=   (Page<Sysuser>) sysuserMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}

	/**
	 * 增加
	 */
	@Override
	public void add(Sysuser sysuser) {
		sysuserMapper.insert(sysuser);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(Sysuser sysuser){
		sysuserMapper.updateByPrimaryKey(sysuser);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public Sysuser findOne(Long id){
		return sysuserMapper.selectByPrimaryKey(id.intValue());
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Long[] ids) {
		for(Long id:ids){
			sysuserMapper.deleteByPrimaryKey(id.intValue());
		}		
	}
	
	
		@Override
	public PageResult findPage(Sysuser sysuser, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		SysuserExample example=new SysuserExample();
		SysuserExample.Criteria criteria = example.createCriteria();
		
		if(sysuser!=null){			
						if(sysuser.getUname()!=null && sysuser.getUname().length()>0){
				criteria.andUnameLike("%"+sysuser.getUname()+"%");
			}
			if(sysuser.getUpass()!=null && sysuser.getUpass().length()>0){
				criteria.andUpassLike("%"+sysuser.getUpass()+"%");
			}
			if(sysuser.getTname()!=null && sysuser.getTname().length()>0){
				criteria.andTnameLike("%"+sysuser.getTname()+"%");
			}
			if(sysuser.getSex()!=null && sysuser.getSex().length()>0){
				criteria.andSexLike("%"+sysuser.getSex()+"%");
			}
			if(sysuser.getTel()!=null && sysuser.getTel().length()>0){
				criteria.andTelLike("%"+sysuser.getTel()+"%");
			}
			if(sysuser.getAddr()!=null && sysuser.getAddr().length()>0){
				criteria.andAddrLike("%"+sysuser.getAddr()+"%");
			}
			if(sysuser.getEmail()!=null && sysuser.getEmail().length()>0){
				criteria.andEmailLike("%"+sysuser.getEmail()+"%");
			}
			if(sysuser.getDelstatus()!=null && sysuser.getDelstatus().length()>0){
				criteria.andDelstatusLike("%"+sysuser.getDelstatus()+"%");
			}
			if(sysuser.getSavetime()!=null && sysuser.getSavetime().length()>0){
				criteria.andSavetimeLike("%"+sysuser.getSavetime()+"%");
			}
			if(sysuser.getUtype()!=null && sysuser.getUtype().length()>0){
				criteria.andUtypeLike("%"+sysuser.getUtype()+"%");
			}
			if(sysuser.getFilename()!=null && sysuser.getFilename().length()>0){
				criteria.andFilenameLike("%"+sysuser.getFilename()+"%");
			}
			if(sysuser.getLogindate()!=null && sysuser.getLogindate().length()>0){
				criteria.andLogindateLike("%"+sysuser.getLogindate()+"%");
			}
	
		}
		
		Page<Sysuser> page= (Page<Sysuser>)sysuserMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}
	
}
