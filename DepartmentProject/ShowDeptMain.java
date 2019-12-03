package com.hcl.department;

import java.util.List;



public class ShowDeptMain {
public static void main(String[] args) {
	DepartmentDao dao=new DepartmentDao();
	List<Department> deptList=dao.showDepartment();
	for (Department d : deptList) {
		System.out.println("Deptno "+d.getDeptno());
		System.out.println("DeptName "+d.getDname());
		System.out.println("Location "+d.getLoc());
		System.out.println("City "+d.getCity());
		System.out.println("Head "+d.getHead());
	}
}
}
