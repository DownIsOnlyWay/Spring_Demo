package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
//        TODO: uzkrauti spring config faila
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        TODO: gauti beana is spring konteineri (context'o)
        Coach coach = context.getBean("trackCoach", Coach.class);

//        TODO: kreipsimes i beano metoda
        System.out.println(coach.getDailyWorkOut());
//        TODO: uzdaryti context'a
        context.close();


    }
}
