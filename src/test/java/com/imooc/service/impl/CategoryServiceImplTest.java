package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import com.imooc.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yy on 2017/9/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findOne() throws Exception {
        ProductCategory productCategory = categoryService.findOne(6);
        Assert.assertEquals(new Integer(6), productCategory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception {
        List<ProductCategory> productCategoryList;
        productCategoryList = categoryService.findAll();
        Assert.assertNotEquals(0, productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<Integer> categoryTypeList = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);
        Assert.assertNotEquals(0,categoryList.size());
    }

    @Test
    public void save() throws Exception {
        ProductCategory productCategory=new ProductCategory("女生热销",11);
        ProductCategory result=categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }

}