package com.greatlearning.Techdpt;
import com.greatlearning.Superdpt.*;

public class Tech extends Super 
{
	public String  departmentName ;
	public String getTodaysWork  ;
	public String getWorkDeadline;
    public String TechStackInformation;
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getTodaysWork() {
		return getTodaysWork;
	}
	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}
	public String getWorkDeadline() {
		return getWorkDeadline;
	}
	public void setGetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}
	public String getTechStackInformation() {
		return TechStackInformation;
	}
	public void setTechStackInformation(String t) {
		TechStackInformation = t;
	}
}
