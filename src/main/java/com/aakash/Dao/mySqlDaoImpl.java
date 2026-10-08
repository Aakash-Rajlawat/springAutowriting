package com.aakash.Dao;


import org.springframework.stereotype.Repository;

@Repository("mySql")
public class mySqlDaoImpl implements reportDao {
    @Override

    public String findData() {
        System.out.println("Fetching data from mySqlDb...");
        return "report data";
    }
}
