package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts.action.ActionForm;

public class CatalogActionForm extends ActionForm {
	
	private List listOfCat =new ArrayList<Catalog>();

	
	
	public List getListOfCat() {
		return listOfCat;
	}

	public void setListOfCat(List listOfCat) {
		this.listOfCat = listOfCat;
	}
	
}
