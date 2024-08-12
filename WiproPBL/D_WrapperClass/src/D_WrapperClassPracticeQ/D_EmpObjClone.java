package D_WrapperClassPracticeQ;

class Employee implements Cloneable {
	 String name;
	 int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public String toString() {
		return "Name : "+name+" Id : "+id;
	}
}

public class D_EmpObjClone {
	public static void main(String args[]) {
		Employee e1 = new Employee("John", 101);
		Employee e2 = null;
		try {
			e2 = (Employee) e1.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		e2.name= "Smith";
		System.out.println(e1);
		//Name : John Id : 101
		System.out.println(e2);
		//Name : Smith Id : 101
	}
}