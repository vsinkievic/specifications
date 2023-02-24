package com.bpmid.specifications;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvenNumberSpecificationTest {

	@Test
	void testIsSatisfiedByEvenNumber() {
		// given 
		Integer numb = 2;
		Specification evenNumber = new EvenNumberSpecification();
		
		// when
		boolean result = evenNumber.isSatisfiedBy(numb);
		String failReason = evenNumber.getFailReason();
		
		// then
		assertTrue(result);
		assertNull(failReason);
	}

	@Test
	void testNotSatisfiedByOddNumber() {
		// given 
		Integer numb = 1;
		Specification evenNumber = new EvenNumberSpecification();
		
		// when
		boolean result = evenNumber.isSatisfiedBy(numb);
		String failReason = evenNumber.getFailReason();
		
		// then
		assertFalse(result);
		assertNotNull(failReason);
	}


	@Test
	void testAndFailsForPositiveOddNumber() {
		// given 
		Integer numb = 1;
		Specification negativeEvenNumber = new NegativeNumberSpecification().and(new EvenNumberSpecification());
		
		// when
		boolean result = negativeEvenNumber.isSatisfiedBy(numb);
		String failReason = negativeEvenNumber.getFailReason();
		
		// then
		assertFalse(result);
		assertNotNull(failReason);
		System.out.println("testAndFailsForPositiveOddNumber for " + numb.toString() + ": " + failReason);
	}

	@Test
	void testAndFailsForNegativeOddNumber() {
		// given 
		Integer numb = -1;
		Specification negativeEvenNumber = new NegativeNumberSpecification().and(new EvenNumberSpecification());
		
		// when
		boolean result = negativeEvenNumber.isSatisfiedBy(numb);
		String failReason = negativeEvenNumber.getFailReason();
		
		// then
		assertFalse(result);
		assertNotNull(failReason);
		System.out.println("testAndFailsForNegativeOddNumber for " + numb.toString() + ": " + failReason);
	}

	@Test
	void testAndFailsForPositiveEvenNumber() {
		// given 
		Integer numb = 2;
		Specification negativeEvenNumber = new NegativeNumberSpecification().and(new EvenNumberSpecification());
		
		// when
		boolean result = negativeEvenNumber.isSatisfiedBy(numb);
		String failReason = negativeEvenNumber.getFailReason();
		
		// then
		assertFalse(result);
		assertNotNull(failReason);
		System.out.println("testAndFailsForPositiveEvenNumber for " + numb.toString() + ": " + failReason);
	}

	@Test
	void testAndSucceedForNegativeEvenNumber() {
		// given 
		Integer numb = -2;
		Specification negativeEvenNumber = new NegativeNumberSpecification().and(new EvenNumberSpecification());
		
		// when
		boolean result = negativeEvenNumber.isSatisfiedBy(numb);
		String failReason = negativeEvenNumber.getFailReason();
		
		// then
		assertTrue(result);
		assertNull(failReason);
	}

	
	@Test
	void testNotIsSatisfiedByEvenNumber() {
		// given 
		Integer numb = 2;
		Specification evenNumber = new EvenNumberSpecification().not();
		
		// when
		boolean result = evenNumber.isSatisfiedBy(numb);
		String failReason = evenNumber.getFailReason();
		
		// then
		assertFalse(result);
		assertNotNull(failReason);
	}

	@Test
	void testNotIsSatisfiedByOddNumber() {
		// given 
		Integer numb = 2;
		Specification evenNumber = new EvenNumberSpecification().not();
		
		// when
		boolean result = evenNumber.isSatisfiedBy(numb);
		String failReason = evenNumber.getFailReason();
		
		// then
		assertFalse(result);
		assertNotNull(failReason);
		System.out.println("testNotIsSatisfiedByOddNumber for " + numb.toString() + ": " + failReason);
	}

	@Test
	void testOrFailsForPositiveOddNumber() {
		// given 
		Integer numb = 1;
		Specification negativeEvenNumber = new NegativeNumberSpecification().or(new EvenNumberSpecification());
		
		// when
		boolean result = negativeEvenNumber.isSatisfiedBy(numb);
		String failReason = negativeEvenNumber.getFailReason();
		
		// then
		assertFalse(result);
		assertNotNull(failReason);
		System.out.println("testAndFailsForPositiveOddNumber for " + numb.toString() + ": " + failReason);
	}

	@Test
	void testOrSucceedForNegativeOddNumber() {
		// given 
		Integer numb = -1;
		Specification negativeEvenNumber = new NegativeNumberSpecification().or(new EvenNumberSpecification());
		
		// when
		boolean result = negativeEvenNumber.isSatisfiedBy(numb);
		String failReason = negativeEvenNumber.getFailReason();
		
		// then
		assertTrue(result);
		assertNull(failReason);
	}

	@Test
	void testOrSucceedForPositiveEvenNumber() {
		// given 
		Integer numb = 2;
		Specification negativeEvenNumber = new NegativeNumberSpecification().or(new EvenNumberSpecification());
		
		// when
		boolean result = negativeEvenNumber.isSatisfiedBy(numb);
		String failReason = negativeEvenNumber.getFailReason();
		
		// then
		assertTrue(result);
		assertNull(failReason);
	}

	@Test
	void testOrSucceedForNegativeEvenNumber() {
		// given 
		Integer numb = -2;
		Specification negativeEvenNumber = new NegativeNumberSpecification().or(new EvenNumberSpecification());
		
		// when
		boolean result = negativeEvenNumber.isSatisfiedBy(numb);
		String failReason = negativeEvenNumber.getFailReason();
		
		// then
		assertTrue(result);
		assertNull(failReason);
	}

}
