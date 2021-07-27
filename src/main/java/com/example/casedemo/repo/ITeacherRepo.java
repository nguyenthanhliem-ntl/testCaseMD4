package com.example.casedemo.repo;

import com.example.casedemo.model.Teacher;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ITeacherRepo extends PagingAndSortingRepository<Teacher,Long> {
}
