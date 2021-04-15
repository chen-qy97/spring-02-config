package com.kuang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置文件优先级依此为：
 *  file:./config/     文件路径为当前项目根目录下
 *  file:./
 *  classpath: /config/
 *  classpath: /   默认为当前等级
 *
 *  .properties 配置文件优先级高于  .yml
 */
@SpringBootApplication
public class Spring02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring02ConfigApplication.class, args);
    }

}
