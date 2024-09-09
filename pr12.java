
import java.util.Scanner;

class employee{
    String f_name;
    String l_name;
    Double salary;

    public void get(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Name of Employee :");
        
        f_name=s.next();
        System.out.print("Enter Last Name of Employee :");
        l_name=s.next();
        System.out.print("Enter Monthly Salary :");
        salary = s.nextDouble();
    }
    public void set(){
        System.out.println("Employee Name: "+f_name+l_name);
        if(salary<0){
            salary=0.0;
        }
        System.out.println("Employee Yearly Salary: "+12*salary);
    }
    public void raise(){
        System.out.println("Employee Raised Salary: "+(12*salary)+(12*salary)/100);
    }
}

public class pr12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        employee [] e = new employee[3];
        System.out.println("Enter Employee Data");
        for(int i=0;i<3;i++){
            e[i]=new employee();
            e[i].get();
        }
        System.out.println("Employee Data is :");
        for(int i=0;i<3;i++){
            e[i].set();
        }
        System.out.println("Employees Raised Salary is :");
        e[0].raise();
        s.close();
    }
    }
   
