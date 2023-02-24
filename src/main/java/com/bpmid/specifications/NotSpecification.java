package com.bpmid.specifications;

public class NotSpecification extends AbstractSpecification {

	private final Specification wrapped;
	
	public NotSpecification(Specification wrapped) {
		this.wrapped = wrapped;
	}
	
	@Override
	public boolean isSatisfiedBy(Object candidate) {
		failReason = null;
		
		if (wrapped.isSatisfiedBy(candidate)) 
			return falseWithReason("NotSpecification cannot describe failReason");
		
		return true;
	}

}
