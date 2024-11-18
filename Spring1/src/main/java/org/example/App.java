package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //we created the spring container and the config for the container is mentioned in spring.xml file in resources folder
        //and now spring knows what are the objects to be created for the classes in the container
        Alien obj1 = (Alien) context.getBean("alien1");
        //obj1.setAge(21);
        // and when we give getBean it will give us the object
        System.out.println(obj1.getAge());
        obj1.code();
        //Alien obj2 = (Alien) context.getBean("alien2");
        //System.out.println(obj2.age);
    }
}
