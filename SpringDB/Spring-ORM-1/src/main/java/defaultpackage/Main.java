package defaultpackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack1.bo.TestBean;

public class Main {
     
	public static void main(String[] args) {
		ApplicationContext ctx =
	    		 new ClassPathXmlApplicationContext("applicationContext.xml");
		TestBean testBean=(TestBean)ctx.getBean("testBean");
		testBean.persistEmp(7981, "AMIT",55000, 30);
        System.out.println("========================================================");
	    testBean.updateEmp(7986, "SUMIT",6767, 30);
	    System.out.println("========================================================");
		   testBean.deleteEmp(7986);
		   System.out.println("========================================================");
		   testBean.selectEmps();
	
	}

}
