package com.aakash.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class reportServiceDao {

    private reportDao reportDao;

    @Autowired
    @Qualifier("mySql")
    public void setReportDao (reportDao reportDao){
        this.reportDao = reportDao;
    }

    public void generateReport(){
        reportDao.findData();
        System.out.println("Generating report...");
    }
}
