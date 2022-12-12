package com.example.learningsprinboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Java", "Anonymous"),
                new Course(2, "Learn PHP", "Anonymous"),
                new Course(3, "Learn Python", "Anonymous"),
                new Course(3, "Learn Javascript", "Anonymous")
        );
    }

}
