package com.expression.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.expression.demo.entity.ArithmeticExpressionEntity;

@Repository
public interface ArithmeticRepo extends JpaRepository<ArithmeticExpressionEntity, Integer> {
	
}
