package it.prova.datamigrator.configuration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
public class ConfigurationDatamigrator {

    @Bean(name = "vecchiodb")
    @ConfigurationProperties("spring.datasource.url")
    @Primary
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "nuovodb")
    @ConfigurationProperties("spring.datasource2.url")
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }


    @Bean(name = "tmvecchio")
    @Autowired
    @Primary
    DataSourceTransactionManager tm1(@Qualifier("vecchiodb") DataSource datasource) {
        DataSourceTransactionManager txm1 = new DataSourceTransactionManager(datasource);
        return txm1;
    }

    @Bean(name = "tmnuovo")
    @Autowired
    DataSourceTransactionManager tm2(@Qualifier("nuovodb") DataSource datasource) {
        DataSourceTransactionManager txm2 = new DataSourceTransactionManager(datasource);
        return txm2;
    }


//    Note that I have @Bean(name="datasource1") and @Bean(name="datasource2"),
//    then you can use it when we need datasource as @Qualifier("datasource1") and @Qualifier("datasource2") , for example
//
//    @Qualifier("datasource1")
//    @Autowired
//    private DataSource dataSource;


//    Then you can use it like
//
//    @Transactional //this will use the first datasource because it is @primary
//    or
//
//    @Transactional("tm2")


}
