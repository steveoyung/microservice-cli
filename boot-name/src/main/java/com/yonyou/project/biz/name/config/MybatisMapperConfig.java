package com.yonyou.project.biz.name.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis 扫描 mapper
 * 
 * @author BENJAMIN
 *
 */
@Configuration
@MapperScan("com.yonyou.project.biz.name.mapper")
public class MybatisMapperConfig {

}
