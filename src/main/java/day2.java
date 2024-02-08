
import java.util.Arrays;
//class and interface name always starts with caps
//it should follow camel casing
//final variable should all be in caps
//package names should all be in lowercase
class Employee
{

    private int empid;
    private String empName;
    private int empSalary;
    private String empDisg;
    private String proj[];
    private static String company="ford";
    //static variable are initiallized outside the obj and being shared to all the obj
    // it will save the memory


    Employee(int empid,String empName,int empSalary,String empDisg,String proj[])
    {
        this.empid=empid;
        this.empSalary=empSalary;
        this.empName=empName;
        this.empDisg=empDisg;
        this.proj=proj;


    }



    Employee(int empid,String empName,int empSalary,String empDisg)
    {
        this.empid=empid;
        this.empSalary=empSalary;
        this.empName=empName;
        this.empDisg=empDisg;

    }
    Employee(int empid,String empName,int empSalary)
    {
        this.empid=empid;
        this.empSalary=empSalary;
        this.empName=empName;
    }
    Employee(int empid, String empName){
        this.empid=empid;
        this.empName= empName;

    }

    Employee()
    {

    }

    public void printer()
    {
        System.out.println(this.empid);
        System.out.println(this.empName);
        System.out.println(this.empSalary);
        System.out.println(this.empDisg);
        System.out.println(Arrays.toString(this.proj));
        System.out.println(this.company);
        System.out.println();
        System.out.println();
    }

    public double getSal()
    {
        return this.empSalary;
    }
    public int  getempid()
    {
        return this.empid;
    }
    public String getempname()
    {
        return this.empName;
    }

}

class EmployeeGradeFinder extends Employee
{
    public String findEmployeeGrades(Employee e[]) {

        for (Employee var : e) {

            double salary = var.getSal();
            String grade = "";

            if (salary > 0 && salary <= 50) {
                grade = "Group A";
            } else if (salary > 50 && salary <= 100) {
                grade = "Group B";
            } else if (salary > 100 && salary <= 150) {
                grade = "Group C";
            } else if (salary > 150) {
                grade = "Group D";
            }

            System.out.println(var.getempid() + " " + var.getempname() + " " + var.getSal() + " " + grade);
        }


        return null;
    }
}



public class day2 {
    public static void main(String[] args) {


        Employee e1=new Employee(101,"arun");
        Employee e2=new Employee(102,"varun",50);
        Employee e3=new Employee(103,"karan",60,"developer");

        String projects[]={"bnm","sdf","wer"};
        Employee e4=new Employee(104,"vishu",70,"developer",projects);
        Employee e5=new Employee(105,"ram",60,"developer",projects);

        Employee e6=new Employee(106,"keshav",106,"developer",projects);

        Employee e7=new Employee(107,"radha",200,"developer",projects);

        Employee e8=new Employee(108,"raj",250,"developer",projects);

        Employee e9=new Employee(109,"arjun",89,"developer",projects);
        Employee e10=new Employee(110,"mahesh",67,"developer",projects);



        e1.printer();
        e2.printer();
        e3.printer();
        e4.printer();
        System.out.println();


        Employee [] empArr={e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};


        EmployeeGradeFinder empGrade=new EmployeeGradeFinder();

        empGrade.findEmployeeGrades(empArr);


    }
}


//inside the class...we are having many blocks like  non static block,static block,class block,
// constructor block,method block,setter method,getter method,operational method or bussiness method

//constructor is meant for calling obj with different arguments

//operational method should have only bussiness logic



