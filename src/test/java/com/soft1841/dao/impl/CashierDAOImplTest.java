package com.soft1841.dao.impl;

import org.junit.Test;

import java.sql.SQLException;


public class CashierDAOImplTest {
    //删除测试
    @Test
    public void deleteTypeById() throws SQLException {
        new CashierDAOImpl().deleteById(18);
    }



}