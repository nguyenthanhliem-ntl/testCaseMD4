package com.example.casedemo.service.teacher;

import com.example.casedemo.model.Teacher;
import com.example.casedemo.repo.IClassRepo;
import com.example.casedemo.repo.ITeacherRepo;
import com.example.casedemo.service.IGenaralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private ITeacherRepo teacherRepo;

    @Override
    public Iterable<Teacher> findAll() {
        return teacherRepo.findAll();
    }

    @Override
    public Optional<Teacher> findById(Long id) {
        return teacherRepo.findById(id);
    }

    @Override
    public void save(Teacher teacher) {
        teacherRepo.save(teacher);    }


    @Override
    public void remove(Long id) {
        teacherRepo.deleteById(id);
    }
}
