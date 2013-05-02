/**
 * 
 */
package com.example.gwt.gson.server;

import java.io.Serializable;

import com.example.gwt.gson.shared.GwtGsonService;
import com.google.gson.Gson;
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
	public String toJson(Serializable obj) {
		return gson.toJson(obj);
	}

	@Override
	public Serializable fromJson(String json, Serializable type) {
		return gson.fromJson(json, type.getClass());
	}
}
