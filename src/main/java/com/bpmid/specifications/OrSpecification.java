package com.bpmid.specifications;

public class OrSpecification extends AbstractSpecification {

	private final Specification left;
	private final Specification right;
	
	public OrSpecification(Specification left, Specification right) {
		this.left = left;
		this.right = right;
	}
	
	@Override
	public boolean isSatisfiedBy(Object candidate) {
		failReason = null;
		if (left.isSatisfiedBy(candidate)) {
			return true;
		} else {
			if (right.isSatisfiedBy(candidate))
				return true;
			else {
				this.failReason = right.getFailReason();
				return false;
			}
		}
	}

}
