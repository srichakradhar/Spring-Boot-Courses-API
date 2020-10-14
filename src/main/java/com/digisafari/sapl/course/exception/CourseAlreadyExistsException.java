package com.digisafari.sapl.course.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "course already exists with this ID")
public class CourseAlreadyExistsException extends Exception {

}
