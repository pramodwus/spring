package pack1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
@Id
@Column(name="empno")
private int empId;

@Column(name="ename",length=10)
private String empName;

@Column(name="sal")
private int empSalary;

private int deptNo;

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", deptNo=" + deptNo
			+ "]";
}

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

public int getEmpSalary() {
	return empSalary;
}

public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}

public int getDeptNo() {
	return deptNo;
}

public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}

}
