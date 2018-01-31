package com.sxt.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String, Date>{
	
	private SimpleDateFormat[] sdfs = {new SimpleDateFormat("yyyy-MM-dd"),new SimpleDateFormat("yyyy/MM/dd"),
			                          new SimpleDateFormat("yyyy.MM.dd"),new SimpleDateFormat("dd-MM-yyyy"),
			                          new SimpleDateFormat("dd/MM/yyyy"),new SimpleDateFormat("dd.MM.yyyy")};
	
    public Date convert(String dateStr) {
    	     	  
    	  for (SimpleDateFormat sdf : sdfs) {
			    try {
			    	 sdf.setLenient(false);
			    	 
			    	 return sdf.parse(dateStr);
				} catch (Exception e) {
					
				}
		  }
    	  
    	  return null;
    };
}
