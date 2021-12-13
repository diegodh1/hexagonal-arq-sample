package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class JpaConfiguration {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("12234");
        dataSource.setPassword("12345");
        dataSource.setUrl(
                "jdbc:mysql://localhost:3306/exampledb?createDatabaseIfNotExist=true");


        return dataSource;
    }
}