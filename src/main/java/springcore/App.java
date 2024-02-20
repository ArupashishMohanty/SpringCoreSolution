package springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	System.out.println("hello");
	
	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
//	Student student1=(Student)context.getBean("student1");
	Student student2=context.getBean(Student.class,"student2");
//	System.out.println(student1);
	System.out.println(student2);
	
}
}
