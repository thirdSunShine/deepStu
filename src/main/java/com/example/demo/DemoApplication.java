package com.example.demo;

//import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.AbstractResource;

@SpringBootApplication
public class DemoApplication implements BeanPostProcessor {

    public static void main(String[] args) {
//        MybatisAutoConfiguration autoConfiguration;
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }
}
