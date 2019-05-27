package com.zzti.fruits.service.iml;


import com.zzti.fruits.Exception.FruitsException;
import com.zzti.fruits.enums.ExceptionEnum;
import com.zzti.fruits.mapper.GoodsMapper;
import com.zzti.fruits.mapper.ProtypeMapper;
import com.zzti.fruits.pojo.Goods;
import com.zzti.fruits.pojo.GoodsExample;
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
    @Autowired
    private GoodsMapper goodsMapper;
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
            List<Protype> protypes = protypeMapper.selectByExample(protypeExample);
            //判断是否有下级分类
            if(protypes!=null&&protypes.size()>0)
                throw  new FruitsException(ExceptionEnum.CHILD_PROTYE_NOT_NULL);
            //判断分类下是否还有商品
            GoodsExample goodsExample=new GoodsExample();
            GoodsExample.Criteria criteria = goodsExample.createCriteria();
            criteria.andSidEqualTo(id);
            GoodsExample.Criteria criteria1 = goodsExample.createCriteria();
            criteria1.andFidEqualTo(id);
            goodsExample.or(criteria1);
            List<Goods> goods = goodsMapper.selectByExample(goodsExample);
            if(goods!=null&&goods.size()>0)
                throw  new FruitsException(ExceptionEnum.PROTYE_GOODS_NOT_NULL);
            //删除分类
            protypeMapper.deleteByPrimaryKey(new Integer(id));
        }
    }

    @Override
    public List<Protype> findAll() {
        return  protypeMapper.selectByExample(null);
    }
}
