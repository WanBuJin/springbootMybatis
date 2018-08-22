package com.dkerlo.springbootMybatis;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@MapperScan("com.dkerlo.springbootMybatis.mapper")
public class Application implements CommandLineRunner{

	@Autowired
    DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/**
	 * 查看用了什么数据库连接池
	 */
	public void run(String... args) throws Exception {
        System.out.println("数据源信息 DATASOURCE = " + dataSource);
    }
}
