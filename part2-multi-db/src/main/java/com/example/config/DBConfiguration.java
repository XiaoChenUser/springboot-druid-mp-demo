package com.example.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 仅在测试多数据源时打开，配合 application-multi.yml 使用
 */
@Configuration
public class DBConfiguration {

    @Primary
    @Bean("db1DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.db1")
    public DataSource db1DataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean("db2DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.db2")
    public DataSource db2DataSource(){
        return DruidDataSourceBuilder.create().build();
    }
}
