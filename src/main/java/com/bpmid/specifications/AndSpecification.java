package com.bpmid.specifications;

public class AndSpecification extends AbstractSpecification {
	
	private final Specification left;
	private final Specification right;
	
	public AndSpecification (Specification left, Specification right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean isSatisfiedBy(Object candidate) {
		failReason = null;
		
		if (! left.isSatisfiedBy(candidate)) {
			return falseWithReason(left.getFailReason());
		} else if (! right.isSatisfiedBy(candidate)) {
			return falseWithReason(right.getFailReason());
		}
		return true;
	}

}
