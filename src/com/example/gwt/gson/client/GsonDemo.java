package com.example.gwt.gson.client;

import java.io.Serializable;

import com.example.gwt.gson.shared.GwtGsonService;
import com.example.gwt.gson.shared.GwtGsonServiceAsync;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GsonDemo implements EntryPoint {

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
				
				gwtGsonService.fromJson(json, new Car(), new AsyncCallback<Serializable>() {

					@Override
					public void onFailure(Throwable caught) {
					}

					@Override
					public void onSuccess(Serializable result) {
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