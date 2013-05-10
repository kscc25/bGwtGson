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

package com.google.gwt.gson.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.gson.shared.GwtGsonService;
import com.google.gwt.gson.shared.GwtGsonServiceAsync;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.IsSerializable;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GwtGson implements EntryPoint {

	private GwtGsonServiceAsync gwtGsonService = GWT
			.create(GwtGsonService.class);
	private String json;

	public void onModuleLoad() {
		Button butToJson = new Button("To Json");
		butToJson.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				gwtGsonService.toJson(new Car("Ferari", "Red", 11111), new AsyncCallback<String>() {

					@Override
					public void onFailure(Throwable caught) {
						// TODO Auto-generated method stub

					}

					@Override
					public void onSuccess(String result) {
						System.out.println("Result is: " + result);
						json = result;
					}
				});

			}
		});
		RootPanel.get().add(butToJson);
		
		Button butFromJson = new Button("From Json");
		RootPanel.get().add(butFromJson);
		butFromJson.addClickHandler(new ClickHandler() {
			
			

			@Override
			public void onClick(ClickEvent event) {
				
				gwtGsonService.fromJson(json, new Car(), new AsyncCallback<IsSerializable>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(IsSerializable result) {
						if (result != null) {
							Car u = (Car) result;
							System.out.println("Car's name is: " + u.getName());
							
						} else {
							System.out.println("nullll");
						}
						
					}
				});
			}
		});
	}
}