package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student1;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	StudentRepo repo;
	public Student1 saveStudent(Student1 s){
		repo.save(s);
		return s;
	}
 
	public Student1 getStudentDetails(Long id)
	{
		Student1 student=repo.findById(id).get();
		return student;
	}
	public List<Student1> findByname(String name) {
		return repo.findByname(name);
	}
	public Student1 findById(Long id){
		Optional<Student1> op=repo.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		return null;
	}
	public List<Student1> findByPercentage(int percentage) {
		return repo.findBypercentage(percentage);
	}
	public List<Student1> findByCollege(String college) {
		return repo.findBycollege(college);
	}
	public List<Student1> findByNameAndCollege(String name,String college) {
		return repo.findByNameAndCollege(name,college);
	}
}
 
	
 
 