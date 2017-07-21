package org.yogakurniawan.repository;

import org.yogakurniawan.domain.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, String> {
    List<Employee> findByFirstNameContainsOrLastNameContains(@Param("firstName") String firstName, @Param("lastName") String lastName);
}
