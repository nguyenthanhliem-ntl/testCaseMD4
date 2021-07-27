package com.example.casedemo.service.classsss;

import com.example.casedemo.model.Classer;
import com.example.casedemo.repo.IClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClassService implements IClassService{
    @Autowired
    private IClassRepo classRepo;

    @Override
    public Iterable<Classer> findAll() {
        return null;
    }

    @Override
    public Optional<Classer> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Classer aClasser) {

    }

    @Override
    public void remove(Long id) {

    }
}
