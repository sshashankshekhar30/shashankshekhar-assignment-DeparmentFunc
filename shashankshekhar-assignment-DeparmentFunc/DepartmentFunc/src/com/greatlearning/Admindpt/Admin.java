package com.greatlearning.Admindpt;
import com.greatlearning.Superdpt.*;

public class Admin extends Super
{
	public String  departmentName ;
	public String TodaysWork  ;
	public String WorkDeadline;
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getTodaysWork() {
		return TodaysWork;
	}
	public void setGetTodaysWork(String getTodaysWork) {
		this.TodaysWork = getTodaysWork;
	}
	public String getWorkDeadline() {
		return WorkDeadline;
	}
	public void setGetWorkDeadline(String WorkDeadline) {
		this.WorkDeadline = WorkDeadline;
	}
}
