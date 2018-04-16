package com.qf.shop.manager.dao;

import com.qf.shop.manager.pojo.po.TbItemDesc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/4/16 0016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class TbItemDescMapperTest {

    @Autowired
    TbItemDescMapper tb;
    @Test
    public void testSelectByExample() throws Exception {
        TbItemDesc tbItemDesc = tb.selectByPrimaryKey(536563L);
        System.out.println(tbItemDesc.getItemDesc());
    }
}