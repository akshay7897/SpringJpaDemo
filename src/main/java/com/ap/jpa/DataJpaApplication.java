package com.ap.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ap.jpa.repo.StudentRepository;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DataJpaApplication.class, args);

		StudentRepository studRepo = context.getBean(StudentRepository.class);
		/*
		 * 
		 * 
		 * List<Student> stud = studRepo.getStudentByGender("male");
		 * 
		 * stud.forEach(s -> System.out.println(s));
		 * 
		 * // List<Student> s = studRepo.getNullValluStudent();
		 * 
		 * // List<Student> s = studRepo.getRank(10);
		 * 
		 * // List<Student> s = studRepo.getRankLessThan(8);
		 * 
		 * // List<Student> s = studRepo.getByGenderAndRank("female", 8);
		 * 
		 * List<Object[]> s = studRepo.getAllStudents();
		 * 
		 * for (Object[] a : s) { System.out.println(a[0] + " " + a[1]); }
		 * 
		 * Student s = new Student();
		 * 
		 * s.setId(111); s.setName("akshay"); s.setGender("male"); s.setRank(1);
		 * 
		 * studRepo.save(s); System.out.println("Record Inserted .......");
		 * 
		 * // fetching all records Iterable<Student> st = studRepo.findAll();
		 * 
		 * for (Student ss : st) { System.out.println(ss); }
		 * 
		 * st.forEach(System.out::println);
		 * 
		 * // fetching single record
		 * 
		 * Student student = studRepo.findById(22).get(); System.out.println(student);
		 * 
		 * // deleting record
		 * 
		 * if (studRepo.existsById(444)) { studRepo.deleteById(444);
		 * System.out.println("record is deleted");
		 * 
		 * } else { System.out.println("record not found"); }
		 * 
		 * // deleted record using custom query Integer delete =
		 * studRepo.deleteStudent(333); System.out.println(delete +
		 * " record deleted...");
		 * 
		 * // updating record using custom query Integer updatedrecord =
		 * studRepo.updateStudent(123, "gita"); System.out.println(updatedrecord +
		 * " record is updated....");
		 */
		
		studRepo.insertStudent(222, "sita", "female", 2);

	}

}
