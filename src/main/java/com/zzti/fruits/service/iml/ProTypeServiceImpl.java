package com.zzti.fruits.service.iml;


import com.zzti.fruits.mapper.ProtypeMapper;
import com.zzti.fruits.pojo.Protype;
import com.zzti.fruits.pojo.ProtypeExample;
import com.zzti.fruits.service.ProTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*=========================================================================
Copyright (C), 2015-2019, 中原工学院
description: 商品分类实现
author: wangbaoqin
Date:2019/4/19  19:19 
updateAuthor:  wangbaoqin
updateDescription: 
updateDate: 2019/4/7
encoding: UTF-8
version: 1.0
=========================================================================*/
@Service
public class ProTypeServiceImpl implements ProTypeService {
    @Autowired
    private ProtypeMapper protypeMapper;

    @Override
    public List<Protype> findPage(String parentId) {
        ProtypeExample example = new ProtypeExample();
        ProtypeExample.Criteria criteria = example.createCriteria();
        criteria.andFatheridEqualTo(parentId);
        return  protypeMapper.selectByExample(example);

    }

    @Override()
    public void add(Protype protype) {
        protype.setDelstatus("1");
        protypeMapper.insert(protype);
    }

    @Override
    public Protype findOne(String id) {
        return  protypeMapper.selectByPrimaryKey(new Integer(id));
    }

    @Override
    public void update(Protype protype) {
        protypeMapper.updateByPrimaryKeySelective(protype);
    }

    @Override
    @Transactional
    public void delete(String[] ids) {
        for (String id:
             ids) {
            //删除下级分类
            ProtypeExample protypeExample=new ProtypeExample();
            protypeExample.createCriteria().andFatheridEqualTo(id);
            protypeMapper.deleteByExample(protypeExample);
            protypeMapper.deleteByPrimaryKey(new Integer(id));
        }
    }
}
