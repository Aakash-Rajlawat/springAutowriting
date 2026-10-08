package com.aakash;

import com.aakash.Dao.reportServiceDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringAutoWiringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(SpringAutoWiringApplication.class, args);
        reportServiceDao reportServiceDao = context.getBean(reportServiceDao.class);
        reportServiceDao.generateReport();
    }

}
