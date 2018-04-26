package cn.leemaster.flowers.single;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.leemaster.flowers.single.mapper")
public class YouSingleBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(YouSingleBeApplication.class, args);
	}
}
