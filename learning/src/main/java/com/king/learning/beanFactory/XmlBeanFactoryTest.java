package com.king.learning.beanFactory;


import com.king.learning.beans.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author king
 * @version 1.0
 * @className XmlBeanFactoryTest
 * @description TODO
 * @date 2022/5/5
 */
public class XmlBeanFactoryTest {

    private static String configuration = "spring-bean.xml";


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(configuration);
//        Person person = context.getBean(Person.class);
//        System.out.println("xml 注入：  " + person);
//
//        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(XmlBeanFactoryTest.class);
//        Person person2 = (Person) annotationConfigApplicationContext.getBean("person-annotation");
//        System.out.println("@Bean 注入 person-annotation：  " + person2);
//        //别名
//        Person person3 = (Person) annotationConfigApplicationContext.getBean("person-annotation1");
//        System.out.println("@Bean 别名注入 person-annotation1：  " + person3);
        new XmlBeanFactoryTest().inject(context);
    }

    @Bean({"person-annotation","person-annotation1"})
    public Person person() {
        Person person = new Person();
        person.setName("person-bean");
        person.setAge(9999);
        person.setSex("未知");
        person.setBirthDate(new Date());
        person.setLocation("银河系M78星云");
        return person;
    }

    public void inject(BeanFactory beanFactory) {
        ApplicationContext context = (ApplicationContext)beanFactory;
        School school = (School) context.getBean("sch_ntu");
        Student student = (Student) context.getBean("stu_ming");
        Teacher teacher = (Teacher) context.getBean("tch_master");

        System.out.println("xml 注入 sch_ntu：  " + school);
        System.out.println("xml 注入 stu_ming：  " + student);
        System.out.println("xml 注入 tch_master：  " + teacher);

//        Address address1 = (Address) context.getBean("bean-autowire-address-01");
//        Address address2 = (Address) context.getBean("bean-autowire-address-02");
//        Address address3 = (Address) context.getBean("bean-autowire-address-03");
//
//        System.out.println("  byType注入  ：bean-autowire-address-01 =>   " + address1);
//        System.out.println("  byName注入  ：bean-autowire-address-02 =>   " + address2);
//        System.out.println("  construct注入  ：bean-autowire-address-03 =>   " + address3);
    }


}
