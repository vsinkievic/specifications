package com.bpmid.specifications;

public interface Specification {

	public String getFailReason();
	
	public boolean isSatisfiedBy(Object candidate);
	
	public Specification and (Specification other);
	public Specification not();
	public Specification or (Specification other);
}
