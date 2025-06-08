package org.example;

import org.example.service.AuthService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 1. 加载Spring配置
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // 2. 获取AuthService Bean (通过IoC容器注入)
        AuthService authService = context.getBean(AuthService.class);

        // 3. 测试用户注册和登录
        authService.register("john", "password123");
        System.out.println("---");

        boolean loginResult1 = authService.login("john", "password123");
        System.out.println("登录结果 (正确密码): " + loginResult1);
        System.out.println("---");

        boolean loginResult2 = authService.login("john", "wrong");
        System.out.println("登录结果 (错误密码): " + loginResult2);
    }
}