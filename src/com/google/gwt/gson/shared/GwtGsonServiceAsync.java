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
