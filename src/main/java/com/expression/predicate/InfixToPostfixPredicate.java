package com.expression.predicate;

@FunctionalInterface
public interface InfixToPostfixPredicate {
	public String convertToPostfix(String expr);
}
