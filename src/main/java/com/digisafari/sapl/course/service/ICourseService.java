package com.digisafari.sapl.course.service;

import java.util.List;

import com.digisafari.sapl.course.exception.CourseAlreadyExistsException;
import com.digisafari.sapl.course.exception.CourseNotFoundException;
import com.digisafari.sapl.course.model.Course;

public interface ICourseService {
	
	public Course createNewCourse(Course course) throws CourseAlreadyExistsException;
	public List<Course> getCourseList();
	public Course updateCourse(Course course) throws CourseNotFoundException;
	public Course getCourseById(String id) throws CourseNotFoundException;
	public boolean deleteCourse(String id) throws CourseNotFoundException;

}
