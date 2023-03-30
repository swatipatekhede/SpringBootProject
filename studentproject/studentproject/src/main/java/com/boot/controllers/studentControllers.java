package com.boot.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.student;
import com.example.reprositry.studentReprositry;

@RestController
public class studentControllers {
    @Autowired
    studentReprositry sr;
    @PostMapping("/studentsave")
    public String savedata(@RequestBody student s)
    {
    	sr.save(s);
    	return "save data";
    }
    @GetMapping("/studentget")
    public student getstudent(@RequestParam int id)
    {
    	Optional<student> op=sr.findById(id);
    	return op.get();
    }
    @DeleteMapping("/deletestudent")
    public String delete(@RequestParam int id)
    {
    	sr.deleteById(id);
    	return "data deleted";
    }
    @PutMapping("/updatedstudent")
    public String save(@RequestBody student s)
    {
    	sr.save(s);
    	return "updated data";
    }
}
