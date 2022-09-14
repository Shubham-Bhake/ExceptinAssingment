package com.yash.exception.customise.exception;


public class StudentResult {

	private int mathMrks;
	private int physcicsMrks;
	private int chemMrks;
	
	public int getChemMrks() {
		return chemMrks;
	}
	public void setChemMrks(int chemMrks) {
		this.chemMrks = chemMrks;
	}
	public int getMathMrks() {
		return mathMrks;
	}
	public void setMathMrks(int mathMrks) {
		this.mathMrks = mathMrks;
	}
	public int getPhyscicsMrks() {
		return physcicsMrks;
	}
	public void setPhyscicsMrks(int physcicsMrks) {
		this.physcicsMrks = physcicsMrks;
	}
	
	@Override
	public String toString() {
		return "StudentResult [mathMrks=" + mathMrks + ", physcicsMrks=" + physcicsMrks + "]";
	}
	
	
	
}
