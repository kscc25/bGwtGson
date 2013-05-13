/*
 * Copyright 2013 heroandtn3 (heroandtn3 [at] gmail.com) 
 * 
 * This file is part of bGwtGson.
 * bGwtGson is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * bGwtGson is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with bGwtGson.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * 
 */
package com.sangnd.gwt.gson.client;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * @author heroandtn3
 * 
 */
public class User implements Serializable, IsSerializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	/**
	 * 
	 */
	public User() {
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
