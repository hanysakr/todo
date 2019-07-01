package com.equitativa.assignment.web;

import org.apache.wicket.markup.html.WebPage;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.basic.Label;

@WicketHomePage
public class HomePage extends WebPage {
	
	public HomePage(){
		add(new Label("message", "ToDo"));
	}
	
}
