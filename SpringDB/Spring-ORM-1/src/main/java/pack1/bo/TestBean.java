package pack1.bo;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack1.dao.EmpDao;
import pack1.entity.Employee;

@Service
public class TestBean 
{
@Autowired
private EmpDao dao;
public void persistEmp(int empId,String empName,int sal,int deptno)
{
	Employee e=new Employee();
		e.setEmpId(empId);
		e.setEmpName(empName);
		e.setEmpSalary(sal);
		e.setDeptNo(deptno);
		dao.saveOrUpdateEmployee(e);
	
	
}

public void updateEmp(int empId,String empName,int sal,int deptno)
{
	Employee e=new Employee();
	e.setEmpId(empId);
	e.setEmpName(empName);
	e.setEmpSalary(sal);
	e.setDeptNo(deptno);
	dao.saveOrUpdateEmployee(e);

	
	
}

public void deleteEmp(int empId)
{
	dao.deleteEmployee(empId);
	
	
}
public void selectEmps()
{
	List list=dao.selectEmployee();
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		Employee e=(Employee)itr.next();
		System.out.println(e);
		
	}
		
}


}
