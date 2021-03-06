package com.tripple;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan(value = { "com.tripple.mapper" })
public class TrippleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrippleApplication.class, args);
	}
	
	@Bean
	  public SqlSessionFactory sqlSessionFactory(DataSource dataSource) 
	      throws Exception {
	    
	    SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
	    sessionFactory.setDataSource(dataSource);



	    return sessionFactory.getObject();
	  }
}
