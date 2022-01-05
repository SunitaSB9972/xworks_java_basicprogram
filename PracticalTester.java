package com.xworkz.jdbc.practical;

import com.xworkz.jdbc.practical.MobileDao;
import com.xworkz.jdbc.practical.MobileDto;


public class PracticalTester {
	
public static void main(String[] args) {
		
	MobileDto dto1 = new MobileDto(1, "SamusungGalaxy7" , 32000, "4gb", "samsung" , 3 );
	MobileDto dto2=  new MobileDto(8,"VIVOV7Pro" , 12000, "4gb", "VIVO" , 4 );
	MobileDto dto3 = new MobileDto(9,"nokia1150" , 2000, "1gb", "nokia" , 1 );
	MobileDto dto4 = new MobileDto(10,"realmenote8" , 22000, "8gb", "realme" , 4 );
		
	MobileDao dao = new MobileDao();
		
	/*	boolean saved1=dao.save(dto1);
		boolean saved2=dao.save(dto2);
		boolean saved3=dao.save(dto3);
		boolean saved4=dao.save(dto4); */
		
		//	System.out.println(saved4);
		//	System.out.println(saved1);
		//	System.out.println(saved2);
		 // System.out.println(saved3);
		 
		
	    dao.delete(2);
		dao.displayAll();
		dao.displayRecordsByBrandName(); 
		dao.updateprice(1);
		
/*	if(dto1.getMobile_id()==1) {
			throw new ExceptionCustom() ; */
		}
		
	}
	



