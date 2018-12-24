package com.soft1841.utils;

import com.soft1841.dao.TypeDAO;
import com.soft1841.dao.impl.TypeDAOImpl;

public class DAOFactory {

    public static TypeDAO getTypeDAOInstance() {
        return new TypeDAOImpl();
    }

}