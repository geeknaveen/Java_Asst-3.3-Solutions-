/*Create a program to demonstrate Constructor Chaining. Between the same class 
and between the child and parent class. */

package asst3_3;

//Constructor chaining example program in same class using this Keyword.
public class Employee {
	 
    // member variables
    int employeeId;
    String employeeName;
    String employeeOrg;
 
    // default constructor
    Employee() {
 
        // an implicit super() constructor call to java.lang.Object is always present until we specify explicitly
        System.out.println("Employee class : Inside default constructor");
        this.employeeOrg = "AcadGild Pvt Ltd";
    }
 
    // Parameterized constructor with 1 argument (String)
    Employee(String name) {
 
        this(); // to invoke another constructor from same class, this() constructor is used
 
        System.out.println("Employee class : Inside parametrized constructor with 1 argument (String)");
        this.employeeName = name;
    }
}