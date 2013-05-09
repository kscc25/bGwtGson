/**
 * 
 */
package com.google.gwt.gson.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * @author heroandtn3
 * 
 */

@RemoteServiceRelativePath("gwtGsonService")
public interface GwtGsonService extends RemoteService {
	public String toJson(IsSerializable src);

	public IsSerializable fromJson(String json, IsSerializable objType);
}
