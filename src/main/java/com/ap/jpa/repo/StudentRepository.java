package com.ap.jpa.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ap.jpa.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	// select * from student_dtls where student_gender=:gender
	@Query("from Student where gender=:gender") 
	//@Query(value ="select * from employee where gender='male'",nativeQuery = true) public
	  List<Student> getStudentByGender(String gender);

	@Query("from Student where gender=null")
	public List<Student> getNullValluStudent();

	// select * from student_dtls where student_rank >= : rank
	@Query("from Student where rank>=:rank")
	public List<Student> getRank(int rank);

	// select * from student_dtls where student_rank <= : rank
	@Query("from Student where rank<=:rank")
	public List<Student> getRankLessThan(int rank);

	// select * from student_dtls where student_gender=:gender and student_rank>=:rank
	@Query("from Student where gender=:gender and rank=:rank")
	public List<Student> getByGenderAndRank(@Param("gender") String gender, @Param("rank") int rank);

	// select student_rank, student_gender from student_dtls;
	@Query("select S.gender,S.rank from Student S")
	public List<Object[]> getAllStudents();

	@Modifying
	@Transactional
	@Query("delete from Student where id=:id")
	public Integer deleteStudent(int id);

	@Modifying
	@Transactional
	@Query("update Student set name=:name where id=:id")
	public Integer updateStudent(int id, String name);

	@Modifying
	@Transactional
	@Query(value = "insert into student(`id`,`name`,`gender`,`rank`) values(:id,:name,:gender,:rank)",nativeQuery = true)
	public void insertStudent(Integer id,String name,String gender,Integer rank);

}
