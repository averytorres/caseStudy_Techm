package com.demo;

import java.io.Serializable;

public class Catalog implements Serializable{
		
		int catid;String catname;String desc;
		
		public Catalog (int ecatid, String ecatname,String edesc){
		catid=ecatid;
		catname=ecatname;
		desc=edesc;
		
		}
	}

