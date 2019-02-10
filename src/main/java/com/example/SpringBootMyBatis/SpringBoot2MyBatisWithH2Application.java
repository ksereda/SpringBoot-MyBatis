//package com.example.SpringBootMyBatis;
//
//import com.example.SpringBootMyBatis.student.Student;
//import com.example.SpringBootMyBatis.student.StudentMyBatisRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringBoot2MyBatisWithH2Application implements CommandLineRunner {
//
//    private Logger logger = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    StudentMyBatisRepository repository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringBoot2MyBatisWithH2Application.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        logger.info("Student id 10001 -> {}", repository.findById(10001L));
//
//        logger.info("Inserting -> {}", repository.insert(new Student(10010L, "John", "A1234657")));
//
//        logger.info("Update 10003 -> {}", repository.update(new Student(10001L, "Name-Updated", "New-Passport")));
//
//        repository.deleteById(10002L);
//
//        logger.info("All users -> {}", repository.findAll());
//    }
//
//}
