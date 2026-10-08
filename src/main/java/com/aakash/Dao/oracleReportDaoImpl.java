package com.aakash.Dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class oracleReportDaoImpl implements reportDao{
    @Override
    public String findData() {
        System.out.println("fetching data from oracleDB...");
        return "report data";
    }
}
