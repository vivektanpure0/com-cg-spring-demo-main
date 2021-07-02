package com.cg.spring.demo.db;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.cg.spring.demo.db.model.Employee;
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

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter eid");
		int eid = sc.nextInt();
		System.out.println("Please enter ename");
		String ename = sc.next();
		System.out.println("Please enter salary");
		double salary = sc.nextDouble();
		Employee emp = new Employee(eid, ename, salary);
		service.insertEmployee(emp);
		System.out.println("All employees:");
		List<Employee> empList = service.getAllEmployees();

		for (Employee e : empList)
			System.out.println(e.toString());

		context.close();

		System.out.println("End");
	}
}