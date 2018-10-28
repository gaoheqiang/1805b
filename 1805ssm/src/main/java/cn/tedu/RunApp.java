package cn.tedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
/**
 * 
 * 开启基于注解的缓存
 * 标注缓存的注解  cacheable cacheevict清除缓存 cacheput 更新缓存
 * @author PHP
 *
 */
@EnableCaching
@SpringBootApplication
@MapperScan(basePackages="cn.tedu.ssm.mapper")
public class RunApp {

	public static void main(String[] args) {
		SpringApplication.run(RunApp.class, args);
	}

}
