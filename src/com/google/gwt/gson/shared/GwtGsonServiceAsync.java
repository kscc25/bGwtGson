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
package com.google.gwt.gson.shared;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * @author heroandtn3
 * 
 */
public interface GwtGsonServiceAsync {

	void fromJson(String json, IsSerializable objType,
			AsyncCallback<IsSerializable> callback);

	void toJson(IsSerializable src, AsyncCallback<String> callback);


}
