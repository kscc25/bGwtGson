/**
 * 
 */
package com.google.gwt.gson.server;

import com.google.gson.Gson;
import com.google.gwt.gson.shared.GwtGsonService;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

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
