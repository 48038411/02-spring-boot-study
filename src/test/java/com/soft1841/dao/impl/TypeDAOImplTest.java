package com.soft1841.dao.impl;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

public class TypeDAOImplTest {
    //删除测试
    @Test
    public void deleteTypeById() throws SQLException {
        new TypeDAOImpl().deleteType(10);
    }

}