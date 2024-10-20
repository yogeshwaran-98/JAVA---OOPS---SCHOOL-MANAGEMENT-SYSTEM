package com.example.oops.principles;

import com.example.oops.principles.models.*;
import com.example.oops.principles.services.AdminService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrinciplesApplication {

	public static void main(String[] args) {

		AdminService adminService = new AdminService();

		Subject math = new Subject("MATH" , "M100" );
		Subject science = new Subject("MATH" , "S100" );

		Teacher teacher1 = new Teacher("George" , 100 , "chennai" , "98765");
		Teacher teacher2 = new Teacher("William" , 101 , "chennai" , "98764");


		Student student1 = new Student("Santhosh" , 1010 , "chennai" , "98761");
		Student student2 = new Student("Ravi" , 1011 , "chennai" , "98761");


		Admin admin = new Admin("Ravi" , 1 , "chennai" , "98761");
		admin.assignTeacherToSubject(teacher1 , math);
		admin.assignTeacherToSubject(teacher2 , science);
		admin.enrollStudentInSubject(student1 , math);
		admin.enrollStudentInSubject(student2 , science);

		GradeRecord grade1 = new GradeRecord(math , 80 , student1);
		GradeRecord grade2 = new GradeRecord(science , 90 , student2);

		adminService.getDetails(student1);
		adminService.getDetails(teacher1);


	}

}
