package com.ysh.seckill.controller;

import com.ysh.seckill.entity.SeckillGoods;
import com.ysh.seckill.service.SeckillGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author joey
 * @date 2018/05/30 00:23
 */
@RequestMapping("/seckillGoods")
@RestController
public class SeckillGoodsController {

    @Autowired
    private SeckillGoodsService seckillGoodsService;


    @RequestMapping("/findList")
    public List<SeckillGoods> findByPage(Integer start, Integer limit) {
        return seckillGoodsService.findAll();
    }

    @RequestMapping("/findOne")
    public SeckillGoods findOne(Long id) {
        return seckillGoodsService.findById(id);
    }
}
