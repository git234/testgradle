package com.mkyong.common.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport{

	private InputStream fileInputStream;
	  
	public InputStream getFileInputStream() {
	 
		return fileInputStream;
	   
	}

	public String execute() throws Exception {
		fileInputStream = new FileInputStream(new File("C:\\downloadfile.txt"));

	    return SUCCESS;
	  
	}

	
}