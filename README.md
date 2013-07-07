## bGwtGson

A library that allows using GWT with [Gson](https://code.google.com/p/google-gson/)

## Download

Download from [here](http://sourceforge.net/projects/bgwtgson/) then add to your build path.

## Setup

### Step 1: Add Gson to your lib folder

Download [Gson](https://github.com/heroandtn3/bGwtGson/raw/master/lib/gson/gson-2.2.3.jar) then add to you `WEB-INF/lib` folder.

### Step 2: Module

Add this to your `Module.gwt.xml`:

```XML
<inherits name="com.sangnd.gwt.gson.GwtGson" />
```

### Step 3: Web.xml

Add this to your `web.xml`:

```XML
<servlet>
	<servlet-name>GwtGsonService</servlet-name>
	<servlet-class>com.sangnd.gwt.gson.server.GwtGsonServiceImpl</servlet-class>
</servlet>
<servlet-mapping>
	<servlet-name>GwtGsonService</servlet-name>
	<url-pattern>/YourProjectPath/gwtGsonService</url-pattern>
</servlet-mapping>
```

## Usage

Your object class must be implemented `IsSerializable` interface like [this example](src/com/sangnd/gwt/gson/client/Car.java).

Create `GwtGsonServiceAsync` instance:

```Java
GwtGsonServiceAsync gwtGsonService = GWT.create(GwtGsonService.class);
```

### From object to Json string

Example:

```Java
gwtGsonService.toJson(new Car("Ferari", "Red", 11111), new AsyncCallback<String>() {

  				@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(String result) {
						System.out.println("Result is: " + result);
					}
				});
```

Output: 

`Result is: {"name":"Ferari","color":"Red","value":11111}`

### From Json string to object

Assume that `json` is a String with value: `{"name":"Ferari","color":"Red","value":11111}`

Example:

```Java
gwtGsonService.fromJson(json, new Car(), new AsyncCallback<IsSerializable>() {

  @Override
  public void onFailure(Throwable caught) {
  }
  
  @Override
  public void onSuccess(IsSerializable result) {
  	if (result != null && result instanceof Car) {
  		Car u = (Car) result;
  		System.out.println("Car's name is: " + u.getName());
  		
  	} else {
  		System.out.println("null");
  	}
  	
  }
});
```
Output: 

`Car's name is: Ferari`

As you see, we must send a "empty" instance of `Car` to send object type via RPC. If you know the more effective way to do this, send me a pull request.

## Author

* [heroandtn3](https://github.com/heroandtn3)

## License 

Copyright (c) 2013 heroandtn3.

Licensed under the GNU General Public License. See [COPYING](COPYING) for details.
