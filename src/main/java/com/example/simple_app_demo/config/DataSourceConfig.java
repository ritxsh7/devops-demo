

package com.example.simple_app_demo.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.simple_app_demo.properties.*;

import javax.sql.DataSource;

@Configuration

public class DataSourceConfig {

    private  DataSourceProperties dataSourceProperties;

public DataSourceConfig(DataSourceProperties dataSourceProperties){
this.dataSourceProperties = dataSourceProperties;
}

    @Bean
    public DataSource dataSource() {
       return DataSourceBuilder.create()
               .type(HikariDataSource.class)
               .url(dataSourceProperties.getJdbcUrl())
               .username(dataSourceProperties.getUserName())
               .password(dataSourceProperties.getPassword())
               .driverClassName(dataSourceProperties.getDriverClassName())
               .build();
    }
}
