/**
 * 
 */
package com.example.gwt.gson.shared;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author heroandtn3
 * 
 */

@RemoteServiceRelativePath("gwtGsonService")
public interface GwtGsonService extends RemoteService {
	public String toJson(Serializable src);

	public Serializable fromJson(String json, Serializable objType);
}
