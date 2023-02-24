package com.bpmid.specifications;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NegativeNumberSpecificationTest {

	@Test
	void testIsSatisfiedByNegativeNumber() {
		// given 
		Integer numb = -2;
		Specification evenNumber = new NegativeNumberSpecification();
		
		// when
		boolean result = evenNumber.isSatisfiedBy(numb);
		String failReason = evenNumber.getFailReason();
		
		// then
		assertTrue(result);
		assertNull(failReason);
	}

	@Test
	void testNotSatisfiedByPositiveNumber() {
		// given 
		Integer numb = 1;
		Specification evenNumber = new NegativeNumberSpecification();
		
		// when
		boolean result = evenNumber.isSatisfiedBy(numb);
		String failReason = evenNumber.getFailReason();
		
		// then
		assertFalse(result);
		assertNotNull(failReason);
	}


}
