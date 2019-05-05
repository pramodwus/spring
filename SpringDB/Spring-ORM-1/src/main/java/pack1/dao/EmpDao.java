package pack1.dao;

import java.util.List;

import pack1.entity.Employee;

public interface EmpDao
{
void saveOrUpdateEmployee(Employee e);
void deleteEmployee(int empid);
List selectEmployee();
}
