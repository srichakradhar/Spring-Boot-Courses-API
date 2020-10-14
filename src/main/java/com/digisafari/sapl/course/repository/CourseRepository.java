package com.digisafari.sapl.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.digisafari.sapl.course.model.Course;

@Repository
public interface CourseRepository extends MongoRepository<Course, String> {
 //Query Methods
}
