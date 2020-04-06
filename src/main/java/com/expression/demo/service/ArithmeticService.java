package com.expression.demo.service;

import java.util.List;

import com.expression.demo.entity.ArithmeticExpressionEntity;
import com.expression.model.ArithmeticBean;

public interface ArithmeticService {
	  public int evaluateExpression(ArithmeticExpressionEntity expressionEntity) throws Exception;
	  
	  public List<ArithmeticBean> getStoredInputOutput();
}
