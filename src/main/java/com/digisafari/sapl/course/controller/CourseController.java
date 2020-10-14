package com.digisafari.sapl.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digisafari.sapl.course.exception.CourseAlreadyExistsException;
import com.digisafari.sapl.course.model.Course;
import com.digisafari.sapl.course.service.ICourseService;

@RestController
@RequestMapping("api/v1/")

public class CourseController {
	// http://localhost:8081/courseservice/api/v1/
	// create a new course (json object) -> HTTP POST
	// http://localhost:8081/courseservice/api/v1/course

	@Autowired
	private ICourseService courseService;

	private ResponseEntity<?> responseEntity;

	@PostMapping("course")
	public ResponseEntity<?> createCourse(@RequestBody Course course) throws CourseAlreadyExistsException {
		System.out.println("Created Course.......");
		Course createdCourse = null;
		try {
			createdCourse = this.courseService.createNewCourse(course);
			if (createdCourse != null) {
				responseEntity = new ResponseEntity<>(createdCourse, HttpStatus.CREATED);
			}
		} catch (CourseAlreadyExistsException e) {
			throw e;
		}

		catch (Exception e) {
			responseEntity = new ResponseEntity<>("Some internal error occured. Please try again!!!",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}

	@GetMapping("course")
	public ResponseEntity<?> getAllCourses() {
		List<Course> coursesList = null;
		try {
			coursesList = this.courseService.getCourseList();
			responseEntity = new ResponseEntity<>(coursesList, HttpStatus.OK);
		} catch (Exception e) {
			responseEntity = new ResponseEntity<>("Some internal error occured. Please try again!!!",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return responseEntity;
	}

}
