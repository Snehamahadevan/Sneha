package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student1;

@Repository
public interface StudentRepo extends JpaRepository<Student1,Long> {
	List<Student1> findByname(String str);
	List<Student1> findBypercentage(int p);
	List<Student1> findBycollege(String str);
	@Query("select u from Student1 u where u.name=?1 and u.college=?2")
	List<Student1> findByNameAndCollege(String s1,String s2);
}
