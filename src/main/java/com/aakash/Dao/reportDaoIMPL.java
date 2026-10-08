package com.aakash.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class reportDaoIMPL implements reportDao{


    public reportDaoIMPL() {
        System.out.println("reportDaoIMPL :: constructed");
    }

    @Override
    public String findData() {
        System.out.println("Fetching the report data...");
        return "Report Data From Database!!!";
    }
}
 