package com.expression.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.expression.demo.entity.ArithmeticExpressionEntity;
import com.expression.demo.service.ArithmeticService;
import com.expression.model.ArithmeticBean;

@Controller
public class ArithmeticController {
	
	@Autowired
	ArithmeticService service;
	
	@RequestMapping(value= "/evaluate",method = RequestMethod.POST)
	public ModelAndView  evaluateExpression(ArithmeticExpressionEntity expressionEntity) {
		ModelAndView model = new ModelAndView();
		try {
			int result = service.evaluateExpression(expressionEntity);
			List<ArithmeticBean> inputOutputList =  service.getStoredInputOutput();
			model.addObject("expression", expressionEntity.getExpression());
			model.addObject("expressionResult", result);
			model.addObject("history", inputOutputList);
			model.setViewName("home.jsp");
		}catch(Exception e) {
			model.setViewName("error.jsp");
			model.addObject("error", "Invalid Expression");
		}
		
		return model;
	}
	
	@RequestMapping(value="/")
	public ModelAndView home() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home.jsp");
		return model;
	}
	
}
