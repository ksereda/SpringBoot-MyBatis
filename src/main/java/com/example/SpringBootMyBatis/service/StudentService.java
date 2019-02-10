//package com.example.SpringBootMyBatis.service;
//
//import com.example.SpringBootMyBatis.dao.StudentMapper;
//import com.example.SpringBootMyBatis.domain.Student;
//import com.github.pagehelper.PageHelper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//
//@Service
//@Transactional(readOnly = true)
//public class StudentService {
//
//    @Autowired
//    private StudentMapper studentMapper;
//
//    public Page<Student> findByPage(int pageNo, int pageSize) {
//        PageHelper.startPage(pageNo, pageSize); //line 1
//        return studentMapper.findByPage(); //line 2
//    }
//
//}
