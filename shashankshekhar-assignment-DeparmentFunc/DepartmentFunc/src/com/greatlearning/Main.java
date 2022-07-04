package com.greatlearning;
import com.greatlearning.Superdpt.*;
import com.greatlearning.Admindpt.*;
import com.greatlearning.HRdpt.*;
import com.greatlearning.Techdpt.*;

public class Main {

	public static void main(String[] args) 
	{
		Admin admin = new Admin();
		HRD hr = new HRD();
		Tech tech = new Tech();
		
		admin.setDepartmentName("Admin Department");
		admin.setGetTodaysWork("Complete your documents submission");
		admin.setGetWorkDeadline("Complete by EOD");
		
		hr.setDepartmentName("HR Department");
		hr.setGetTodaysWork("Fill today's worksheet and mark your attendence");
		hr.setGetWorkDeadline("Complete by EOD");
		hr.setDoActivity("Team Lunch");
		
		tech.setDepartmentName("Tech Department");
		tech.setGetTodaysWork("Complete coding of module 1");
		tech.setGetWorkDeadline("Complete by EOD");
		tech.setTechStackInformation("Core Java");
		
		System.out.println("Welcome to"+admin.getDepartmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(Super.getIsTodayAHoliday());
		
		System.out.println("\n");
		
		System.out.println("Welcome to"+hr.getDepartmentName());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.getDoActivity());
		System.out.println(Super.getIsTodayAHoliday());
		
		System.out.println("\n");
		
		System.out.println("Welcome to"+tech.getDepartmentName());
		System.out.println(tech.getTodaysWork);
		System.out.println(tech.getWorkDeadline);
		System.out.println(tech.getTechStackInformation());
		System.out.println(Super.getIsTodayAHoliday());
		
		
	}

}
