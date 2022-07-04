package com.greatlearning.HRdpt;
import com.greatlearning.Superdpt.*;

public class HRD extends Super 
{
	public String  departmentName ;
	public String TodaysWork  ;
	public String WorkDeadline;
	public String doActivity;
	
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
	public String getDoActivity() {
		return doActivity;
	}
	public void setDoActivity(String doActivity) {
		this.doActivity = doActivity;
	}
}
