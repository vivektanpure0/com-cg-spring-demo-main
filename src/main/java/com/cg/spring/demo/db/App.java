package com.cg.spring.demo.db;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.cg.spring.demo.db.service.EmployeeService;



@ComponentScan
public class App {

//	@Autowired

	public static void main(String[] args) {

		System.out.println("Start");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.cg.spring.demo.db");
		context.refresh();

		EmployeeService service = context.getBean(EmployeeService.class);
		System.out.println(service.getEmployeebyId(101).toString());

		context.close();

		System.out.println("End");
	}
}
   