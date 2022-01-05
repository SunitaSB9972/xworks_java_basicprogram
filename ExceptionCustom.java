package com.xworkz.jdbc.practical;
import java.lang.RuntimeException;

public class ExceptionCustom extends RuntimeException {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return " mobile ";
	}

}
