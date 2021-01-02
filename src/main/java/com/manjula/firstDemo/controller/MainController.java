package com.manjula.firstDemo.controller;


import com.manjula.firstDemo.Student;
import com.manjula.firstDemo.repository.StudentRepository;
import com.manjula.firstDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.manjula.firstDemo.model.Response;

@RestController
public class MainController {
    @Autowired
    StudentService studentService;


//    @RequestMapping(value = "/hi",method = RequestMethod.PUT)
//    public String welcoming1(){
//        return "Hello Manjula !!! Welcome to Sprimg. PUT";
//    }
//    @RequestMapping(value = "/hi",method = RequestMethod.POST)
//    public String welcoming2(){
//        return "Hello Manjula !!! Welcome to Sprimg. POST";
//    }
//
    @RequestMapping(value = "/hi")
    public String welcoming(){
        return "Hello Manjula !!! Welcome to Sprimg. ***";
    }
//
//
//    @RequestMapping("/app/helloworld")
//    public Response getGreeting() {
//        Response response = new Response();
//        response.setCode("SAMPLE_CODE");
//        response.setMessage("This is sample message");
//        return response;
//
//    }

    @RequestMapping(value = "/student", method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }


    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id){
        Student student = studentService.fetchStudentById(id);
        if(student==null){
            return   ResponseEntity.notFound().build();
        }else{
            return  ResponseEntity.ok().body(student);
        }
    }
}


