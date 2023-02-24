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
			this.failReason = left.getFailReason();
			return false;
		} else if (! right.isSatisfiedBy(candidate)) {
			this.failReason = right.getFailReason();
			return false;
		}
		return true;
	}

}
