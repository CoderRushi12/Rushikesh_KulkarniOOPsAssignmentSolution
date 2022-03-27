package com.department.main;

import com.department.service.AdminDepartment;
import com.department.service.HrDepartment;
import com.department.service.SuperDepartment;
import com.department.service.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayAdmindept();
		displayHrdept();
		displayTechDept();
	}

	public static void displayAdmindept() {
		SuperDepartment adminDepartment;
		adminDepartment = new AdminDepartment();
		System.out.println(" Welcome to" + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday());
		System.out.println();
	}

	public static void displayHrdept() {
		HrDepartment hrDepartment = new HrDepartment();
		System.out.println(" Welcome to" + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday());
		System.out.println();
	}

	public static void displayTechDept() {
		TechDepartment techDepartment = new TechDepartment();
		System.out.println(" Welcome to" + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.getTechStackInformation());
		System.out.println(techDepartment.isTodayAHoliday());
		System.out.println();
	}

}
