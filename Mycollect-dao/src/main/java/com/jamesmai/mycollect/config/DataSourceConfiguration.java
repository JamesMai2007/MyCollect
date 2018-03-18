package com.jamesmai.mycollect.config;

//import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2018/3/17.
 */
//@Configuration
public class DataSourceConfiguration {

    //@Bean(destroyMethod = "", name = "EmbeddeddataSource")
    public DataSource dataSource() {
        /*DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
        dataSourceBuilder.url("jdbc:sqlite:" + "test.db");
        //dataSourceBuilder.type(SQLiteDataSource.class);
        return dataSourceBuilder.build();*/
        return null;
    }
}