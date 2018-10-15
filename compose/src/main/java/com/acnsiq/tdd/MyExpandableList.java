package com.acnsiq.tdd;

/*
 * Based on example in "Refactoring to Patterns"
 * by Joshua Kerievsky
 * 
 * See https://www.industriallogic.com/xp/refactoring/composeMethod.html
 */

public class MyExpandableList {

	private Object[] elements = new Object[10];
	private boolean readOnly;
	private int size;
	
	public MyExpandableList(boolean readOnly) {
		this.readOnly = readOnly;
	}
	
	public void add(Object element) {
		if  (readOnly) {
			return;
		} 
		
		int newSize = elements.length + 1;
		if (elements.length + 1 > elements.length) {
			Object[] newElements = new Object[elements.length + 10];
			for (int i = 0; i < size; i++) {
				newElements[i] = elements[i];
			}
			elements = newElements;
		}
		elements[size] = element;
		size++;
	}
	
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	
	public boolean isReadOnly() {
		return readOnly;
	}
}
