import java.util.*;
class person{
    String name;
    int age;
    String gender;
    person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}
class employee extends person{
    String company;
    double salary;
    employee(String name,int age,String gender,String company,double salary){
        super(name,age,gender);
        this.company=company;
        this.salary=salary;
    }
    void display(){
        super.display();
        System.out.println("Company: " + company);
        System.out.println("Salary: " + salary);
    }
}
class student extends person{
    String school;
    double grade;
    student(String name,int age,String gender,String school,double grade){
        super(name,age,gender);
        this.school=school;
        this.grade=grade;
    }
    void display(){
        super.display();
        System.out.println("School: " + school);
        System.out.println("Grade: " + grade);
    }
}
public class prog4{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        employee emp[]=new employee[2];
        student stu[]=new student[2];
         System.out.println("Enter Employee Details:");
    for(int i=0; i<2; i++){
        System.out.print("Name age gender Company Salary: ");
        emp[i] = new employee(
            sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextDouble()
        );
    }
    System.out.println("Enter Student Details:");
    for(int i=0; i<2; i++){
        System.out.print("Name age gender School Grade: ");
        stu[i] = new student(
            sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextDouble()
        );
    }
     System.out.println("\nEmployee Details:");
        for (employee e : emp) {
            e.display();
            System.out.println();
        }

        System.out.println("Student Details:");
        for (student s : stu) {
            s.display();
            System.out.println();
        }

    }
}