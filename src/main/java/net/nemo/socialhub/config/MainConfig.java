package net.nemo.socialhub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by tonyshi on 2016/12/22.
 */

@Configuration
@ComponentScan(basePackages = "net.nemo.socialhub", excludeFilters = { @ComponentScan.Filter(Configuration.class) })
public class MainConfig {

    @Bean
    public DataSource dataSource(){
        return null;
    }
}
