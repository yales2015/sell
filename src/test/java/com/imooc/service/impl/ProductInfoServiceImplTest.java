package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yy on 2017/9/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoServiceImplTest {
    @Autowired
    private ProductInfoServiceImpl productInfoService;
    @Test
    public void findOne() throws Exception {
        ProductInfo result=productInfoService.findOne("123456");
        Assert.assertNotNull(result);
    }

    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest=new PageRequest(0,2);
        Page<ProductInfo> page=productInfoService.findAll(pageRequest);
        System.out.print(page.getTotalElements());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> productInfoList=productInfoService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo=new ProductInfo("234567","黄焖鸡",new BigDecimal(13.12),500,"少辣",null,0,11);
    }

}