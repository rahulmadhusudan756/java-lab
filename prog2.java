import java.util.*;
class employee{
    String name;
    int id;
    int age;
    String dept;
    String designation;
    Double salary;
    employee(String name,int id,int age,String dept,String designation,Double salary){
        this.name=name;
        this.age=age;
        this.id=id;
        this.dept=dept;
        this.designation=designation;
        this.salary=salary;
    }
}

public class prog2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        employee emp[] = new employee[2];
        for(int i=0;i<2;i++){
            System.out.println("Enter details of Employee " + (i + 1) + "in order of name id age dept designation and salary");
            emp[i]= new employee(sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
        }

         for(int i=0; i<2; i++){
            System.out.println(emp[i].name + " " + emp[i].id + " " +
                               emp[i].dept + " " + emp[i].age + " " +
                               emp[i].designation + " " + emp[i].salary);
        }
        double salessum=0;
        for (employee e : emp){
            if(e.dept.equalsIgnoreCase("sales")) salessum+=e.salary;
        }
        System.out.println("Salary of Sales dept: " + salessum);
        employee highestPaidManager = null;
        for(employee e : emp){
            if(e.dept.equalsIgnoreCase("sales") && e.designation.equalsIgnoreCase("manager")){
                if(highestPaidManager == null || highestPaidManager.salary<e.salary)
                    highestPaidManager=e;
            }
        }
        System.out.println("Highest paid manager: " + highestPaidManager.name + " " + highestPaidManager.salary);
    }
}