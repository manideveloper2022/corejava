package pracfiles;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class interview6 {
		 public static void main(String[] args) {
		     List<Employee> emps = new ArrayList<>();
		     emps.add(new Employee("A100", "RAM", 25, 10000f));
		     emps.add(new Employee("A101", "SHYAM", 26, 10001f));
		     emps.add(new Employee("A102", "KUMAR", 27, 10002f));
			
		     Employee employee = emps.stream().filter(e -> e.getEmpId().equals("A101")).findFirst().get();
		     System.out.println(employee);
		     
		     
		     Map<String,Employee> map = new HashMap<>();
		     map.put("A100",new Employee("A100", "RAM", 25, 10000f));
		     map.put("A101",new Employee("A101", "SHYAM", 26, 10001f));
		     map.put("A102",new Employee("A102", "KUMAR", 27, 10002f));
		     
		    
		     
		     Employee emp2 = map.get("A101");
		     System.out.println(emp2);
		     
		     
		     Map<String,String> map2 = new HashMap<>();
		     map2.put("a", "1");
		     map2.put("b", null);
		     map2.put(null, "10");
		     map2.put("null", "15");
		     map2.put(null, "20");
		     map2.put("b", "50");
		     
		     System.out.println(map2.size());
		     
		     /*
		      Employee:            
		      id 
		      name
		      
		      
		      SalaryDetails:
		      id
		      empId
		      monthCode
		      
		     
		     id     empId  monthCode   salary
		     101    202    06-2023     50000
		     102    202    07-2023     51000
		     102    203    06-2023     45000
		     
		     
		     Select sum(salary) from SalaryDetails where empId = 202;
		     Select empId, sum(salary) from SalaryDetails group by empId;
		     
		     -- top most paid
		      Select max(totalSal )
		       from  (Select empId, sum(salary) as totalSal from SalaryDetails group by empId);
		       
		      --
		        Select empId, sum(salary)  as totalSal
		        from SalaryDetails group by empId order by totalSal desc
		        limit 1 
		        
		        --
		        Select sum(salary) from SalaryDetails where monthCode like '%-2022';
		       
		       				
		   
		      */
		    }
		 
		 
		 public static class Employee{
			 String empId;
			 String name;
			 int age;
			 Float salary;
			public Employee(String empId, String name, int age, Float salary) {
				super();
				this.empId = empId;
				this.name = name;
				this.age = age;
				this.salary = salary;
			}
			public String getEmpId() {
				return empId;
			}
			public void setEmpId(String empId) {
				this.empId = empId;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public Float getSalary() {
				return salary;
			}
			public void setSalary(Float salary) {
				this.salary = salary;
			}
			@Override
			public String toString() {
				return "Employee [empId=" + empId + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
			}
		
		 }
}
