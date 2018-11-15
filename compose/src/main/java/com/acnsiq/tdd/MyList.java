package com.acnsiq.tdd;

/*
 * Based on example in "Refactoring to Patterns"
 * by Joshua Kerievsky
 * 
 * See https://www.industriallogic.com/xp/refactoring/composeMethod.html
 */

public class MyList {
	private Object[] elements = new Object[10];
	private int size;
	private boolean readOnly;
	
	public void add(Object element) {
		if (!readOnly) {
			int newSize = size + 1;
			if (elements.length < newSize) {
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

	int getSize() {
		return size;
	}

	int getCapacity() {
		return elements.length;
	}
}
