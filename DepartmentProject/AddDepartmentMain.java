package com.hcl.department;

import java.util.Scanner;

public class AddDepartmentMain {
public static void main(String[] args) {
	DepartmentDao dao=new DepartmentDao();
	//System.out.println(dao.generateDepartmentno());
	Department dept=new Department();
	int deptno=dao.generateDepartmentno();
	dept.setDeptno(deptno);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Dept name ");
	dept.setDname(sc.nextLine());
	System.out.println("Enter City ");
	dept.setCity(sc.nextLine());
	System.out.println("Enter Loc ");
	dept.setLoc(sc.nextLine());
	System.out.println("Enter Head ");
	dept.setHead(sc.nextLine());
	System.out.println(dao.addDepartment(dept));
	


}
}
