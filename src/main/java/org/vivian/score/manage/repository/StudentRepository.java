package org.vivian.score.manage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.vivian.score.manage.entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer> {
    public List<Student> findByClazzNo(int clazzNo);
}
