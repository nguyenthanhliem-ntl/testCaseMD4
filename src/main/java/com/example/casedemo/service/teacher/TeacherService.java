package com.example.casedemo.service.teacher;

import com.example.casedemo.model.Teacher;
import com.example.casedemo.repo.IClassRepo;
import com.example.casedemo.service.IGenaralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class TeacherService implements ITeacherService {
    @Autowired
    private IClassRepo classRepo;

    @Override
    public Iterable<Teacher> findAll() {
        return null;
    }

    @Override
    public Optional<Teacher> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Teacher teacher) {

    }


    @Override
    public void remove(Long id) {

    }
}
