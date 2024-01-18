package org.vivian.score.manage.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.vivian.score.manage.entity.Clazz;

@Repository
public interface ClazzRepository extends PagingAndSortingRepository<Clazz, Integer> {
}
