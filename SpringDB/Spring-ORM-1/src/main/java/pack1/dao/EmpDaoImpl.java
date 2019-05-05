package pack1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import pack1.entity.Employee;
@Repository
@Transactional
public class EmpDaoImpl implements EmpDao {
    @Autowired
	private HibernateTemplate ht;
    
    public void saveOrUpdateEmployee(Employee e) 
	{
	ht.saveOrUpdate(e);
	System.out.println("object is saved/updates");
		
	}

	public void deleteEmployee(int empid) {
	Employee e=(Employee)ht.get(Employee.class,empid);
	ht.delete(e);
	System.out.println("Object is deleted");
	
	}

	public List selectEmployee() {
	List employeeList=ht.find("from Employee e");		
		
		return employeeList;
	}

}
