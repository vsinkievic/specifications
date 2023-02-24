package com.bpmid.specifications;

public class EvenNumberSpecification extends AbstractSpecification {

	@Override
	public boolean isSatisfiedBy(Object candidate) {
		
		if (candidate == null) 
			throw new IllegalArgumentException("Number cannot be null!");
		
		if (candidate instanceof Integer) {
			Integer intCandidate = (Integer) candidate;
			if (intCandidate % 2 == 0)
				return true;
			else {
				this.failReason = String.format("%d is not even number!", intCandidate);
				return false;
			}
			
		} 
		throw new IllegalArgumentException(candidate.getClass().getCanonicalName() + " is not supported!");
	}

}
