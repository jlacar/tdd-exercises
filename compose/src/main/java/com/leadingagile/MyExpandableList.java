package com.leadingagile;

public class MyExpandableList {

	private Object[] elements = new Object[10];
	private boolean readOnly;
	private int size;
	
	public MyExpandableList(boolean readOnly) {
		this.readOnly = readOnly;
	}
	
	public void add(Object element) {
		if (!readOnly) {
			int newSize = elements.length + 1;
			if (newSize > elements.length) {
				Object[] newElements = new Object[elements.length + 10];
				for (int i = 0; i < size; i++) {
					newElements[i] = elements[i];
				}
				elements = newElements;
			}
			elements[size] = element;
			size++;
		}
	}
	
	public void setReadOnly(boolean readOnly) {
		this.readOnly = readOnly;
	}
	
	public boolean isReadOnly() {
		return readOnly;
	}
}
