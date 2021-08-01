package com.example.casedemo.service.point;

import com.example.casedemo.model.Point;
import com.example.casedemo.repo.IPointRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PointService implements IPointService{

    @Autowired
    private IPointRepo pointRepo;

    @Override
    public Iterable<Point> findAll() {
        return pointRepo.findAll();
    }

    @Override
    public Optional<Point> findById(Long id) {
        return pointRepo.findById(id);
    }

    @Override
    public void save(Point point) {
        pointRepo.save(point);
    }

    @Override
    public void remove(Long id) {
        pointRepo.deleteById(id);
    }
}
