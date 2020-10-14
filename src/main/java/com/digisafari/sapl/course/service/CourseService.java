package com.digisafari.sapl.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digisafari.sapl.course.exception.CourseAlreadyExistsException;
import com.digisafari.sapl.course.exception.CourseNotFoundException;
import com.digisafari.sapl.course.model.Course;
import com.digisafari.sapl.course.repository.CourseRepository;

@Service
public class CourseService implements ICourseService {

	@Autowired
	CourseRepository courseRepository;
	
	public CourseService() {
		
	}
	
	@Override
	public Course createNewCourse(Course course) throws CourseAlreadyExistsException {
		Course createdCourse = null;
		try {
			Optional<Course> courseById = this.courseRepository.findById(course.getId());
			if(courseById.isPresent()) {
				throw new CourseAlreadyExistsException();
			} else {
				createdCourse = this.courseRepository.save(course);
			}
		} catch (CourseAlreadyExistsException e) {
			throw e;
		} catch(Exception e) {
			
		}
		return createdCourse;
	}

	@Override
	public List<Course> getCourseList() {
		
		return this.courseRepository.findAll();
	}

	@Override
	public Course updateCourse(Course course) throws CourseNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourseById(String id) throws CourseNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCourse(String id) throws CourseNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

}
