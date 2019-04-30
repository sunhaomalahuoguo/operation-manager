package com.sumavision;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@MapperScan("com.sumavision.operation.dao")
@SpringBootApplication
public class operation_manager_03_trade_provider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(operation_manager_03_trade_provider_8001.class,args);
    }

    //配置mybatis的分页插件pageHelper
    @Bean
    public PageHelper pageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","Oracle");    //配置Oracle数据库的方言
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
