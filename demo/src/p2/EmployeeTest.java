package p2;
import p1.*;

public class EmployeeTest {
	public static void main(String args[]){
        // ������������
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");
        // ��������������ĳ�Ա����
        empOne.empAge(26);
        empOne.empDesignation("Senior Software Engineer");
        empOne.empSalary(1000);
        empOne.printEmployee();
        empTwo.empAge(21);
        empTwo.empDesignation("Software Engineer");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}