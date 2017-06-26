/*Create a program to demonstrate Constructor Chaining. Between the same class 
and between the child and parent class. 
*/
package asst3_3;

//Constructor chaining example program between the child and parent class.
public class PermanentEmployee extends Employee {
	 
    // Parameterized constructor with 2 arguments (int, String)
    PermanentEmployee(int id, String name) {
 
        super(name); // call to super class's constructor
 
        System.out.println("PermanentEmployee class: Inside parametrized constructor with 2 arguments (int, String)");
        this.employeeId = id;
    }
 
    // display() method
    void displayEmployeeInfo() {
        System.out.println("\nEmployee details:  \nOrgnaization: " + employeeOrg + "\nId: " + employeeId + "\nName: " + employeeName + "\n");
    }
 
    // main() method - entry point to JVM
    public static void main(String args[]) {
 
        // construct an object for permanent employee
        System.out.println("Creating and displaying permanent employee details\n");
 
        PermanentEmployee permanentEmp = new PermanentEmployee(25, "Virat Kohli");
        permanentEmp.displayEmployeeInfo();
             }
}