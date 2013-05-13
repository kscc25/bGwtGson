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
package com.sangnd.gwt.gson.server;

import com.google.gson.Gson;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.sangnd.gwt.gson.shared.GwtGsonService;

/**
 * @author heroandtn3
 * 
 */
public class GwtGsonServiceImpl extends RemoteServiceServlet implements
		GwtGsonService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Gson gson = new Gson();

	/**
	 * 
	 */
	public GwtGsonServiceImpl() {
	}

	@Override
	public String toJson(IsSerializable obj) {
		return gson.toJson(obj);
	}

	@Override
	public IsSerializable fromJson(String json, IsSerializable type) {
		return (IsSerializable) gson.fromJson(json, type.getClass());
	}
}
