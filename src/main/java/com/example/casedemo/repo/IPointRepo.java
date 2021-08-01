package com.example.casedemo.repo;

import com.example.casedemo.model.Point;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IPointRepo extends PagingAndSortingRepository<Point,Long> {
}
