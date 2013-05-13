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
package com.sangnd.gwt.gson.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author heroandtn3
 * 
 */

@RemoteServiceRelativePath("gwtGsonService")
public interface GwtGsonService extends RemoteService {
	
	/**
	 * This method serializes the specified object into its 
	 * equivalent Json representation.
	 * @param src the object for which Json representation 
	 * is to be created setting for Gson
	 * @return Json representation of {@code src}.
	 */
	public String toJson(IsSerializable src);

	/**
	 * This method deserializes the specified Json into 
	 * an object of the specified class.
	 * @param json the string from which the object is to be deserialized
	 * @param objType an "empty" object to send object type via RPC
	 * @return an IsSerializable object of type of objType from the string
	 */
	public IsSerializable fromJson(String json, IsSerializable objType);
}
