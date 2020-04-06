package com.expression.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.expression.demo.entity.ArithmeticExpressionEntity;
import com.expression.demo.service.ArithmeticService;

@SpringBootTest
class ExpressionEvaluationUsingBootApplicationTests {
	
    @Autowired
    private ArithmeticService arithmeticService;
	
	
	@Test
	void testExpression() {
		
		//Test 1
		ArithmeticExpressionEntity expEntity = new ArithmeticExpressionEntity();
		expEntity.setExpression("(1+(3-2))");
		try {
			int res = arithmeticService.evaluateExpression(expEntity);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
