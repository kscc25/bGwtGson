/**
 * 
 */
package com.google.gwt.gson.shared;

import java.io.Serializable;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * @author heroandtn3
 * 
 */
public interface GwtGsonServiceAsync {

	void fromJson(String json, Serializable objType,
			AsyncCallback<Serializable> callback);

	void toJson(Serializable src, AsyncCallback<String> callback);


}
