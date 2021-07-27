package com.example.casedemo.repo;

import com.example.casedemo.model.Classer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClassRepo extends PagingAndSortingRepository<Classer,Long> {
}
