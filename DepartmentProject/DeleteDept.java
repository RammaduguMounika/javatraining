package com.hcl.department;

import java.util.Scanner;

public class DeleteDept {
	public static void main(String[] args) {
		
	
	int deptno;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Department no: ");
	deptno=sc.nextInt();
	DepartmentDao dao=new DepartmentDao();
	System.out.println(dao.deleteDepartment(deptno));
	}
}

