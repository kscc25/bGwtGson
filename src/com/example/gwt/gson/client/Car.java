/**
 * 
 */
package com.example.gwt.gson.client;

import java.io.Serializable;

/**
 * @author heroandtn3
 * 
 */
public class Car implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String color;
	private long value;

	/**
	 * 
	 */
	public Car() {
	}

	public Car(String name, String color, long value) {
		this.name = name;
		this.color = color;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

}
