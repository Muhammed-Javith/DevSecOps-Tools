package com.app.model;

public class Emplo {
	private int empId;
	private String empName;
	private int empSal;

//alt+shift+O (De-select All->OK)
	public Emplo() {
	}

//alt+Shift+S , R (select all) ->OK
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	// alt+shift+s,s ->ok
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
}
