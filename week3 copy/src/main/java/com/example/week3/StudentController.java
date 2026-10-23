package com.example.week3;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final Map<Integer, String> students = new HashMap<>();
    private int nextId = 1;

    @PostMapping
    public Map<String, Object> addStudent(@RequestBody Map<String, String> data) {
        int id = nextId++;
        students.put(id, data.get("name"));

        return Map.of("id", id, "name", data.get("name"));
    }

    @GetMapping
    public Map<Integer, String> getAllStudents() {
        return students;
    }

    @GetMapping("/{id}")
    public String getStudent(@PathVariable int id) {
        return students.containsKey(id)
                ? students.get(id)
                : "Student not found";
    }

    @PutMapping("/{id}")
    public String updateStudent(
            @PathVariable int id,
            @RequestBody Map<String, String> data) {
        if (!students.containsKey(id)) {
            return "Student not found";
        }

        students.put(id, data.get("name"));
        return "Student updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        if (students.remove(id) == null) {
            return "Student not found";
        }

        return "Student deleted successfully";
    }
}