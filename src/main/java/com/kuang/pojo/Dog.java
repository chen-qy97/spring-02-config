package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//javaConfig  绑定特定配置文件的值
//加载指定的配置文件
@PropertySource(value = "classpath:qinjiang.properties")
public class Dog {

    /*//初始化赋值
    @Value("旺财")
    private String name;
    @Value("3")
    private Integer age;*/

    @Value("${name}")
    private String name;
    @Value("${age}")
    private Integer age;

    public Dog() {
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
