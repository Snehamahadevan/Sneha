package com.example.demo.model;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

	@Entity
	@Table(name="Student1")
	public class Student1 {
		@Id
		@SequenceGenerator(name="Student1_sequence",sequenceName="Student1_sequence",allocationSize=1)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Student1_sequence")
		Long id;
		@NotNull
		String name;
		String college;
		int percentage;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCollege() {
			return college;
		}
		public void setCollege(String college) {
			this.college = college;
		}
		public int getPercentage() {
			return percentage;
		}
		public void setPercentage(int percentage) {
			this.percentage = percentage;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", college=" + college + ", percentage=" + percentage + "]";
		}
}

