package com.bpmid.specifications;

public abstract class AbstractSpecification implements Specification {

	protected String failReason = null;
	
	@Override
	public String getFailReason() {
		return failReason;
	}

	@Override
	public Specification and(Specification other) {
		
		return new AndSpecification(this, other);
	}

	@Override
	public Specification not() {
		return new NotSpecification(this);
	}

	@Override
	public Specification or(Specification other) {
		return new OrSpecification(this, other);
	}

	@Override
	public abstract boolean isSatisfiedBy(Object candidate);

}
