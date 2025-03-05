import java.util.Scanner;

class InvalidEmpId extends Exception {
    InvalidEmpId(String error) {
        super(error);
    }
}

class InvalidName extends Exception {
    InvalidName(String error) {
        super(error);
    }
}

class InvalidDept extends Exception {
    InvalidDept(String error) {
        super(error);
    }
}

class Employee {
    int employee_id;
    String name;
    int dept_id;

    Employee(int employee_id,String name,int dept_id) {
        this.employee_id=employee_id;
        this.name=name;
        this.dept_id=dept_id;
    }

    void display() {
        System.out.println("Employee Name: "+this.name);
        System.out.println("Employee ID: "+this.employee_id);
        System.out.println("Department ID: "+this.dept_id);
    }

    static void validateEmpId(int employee_id) throws InvalidEmpId {
        if(employee_id<2001 || employee_id>5001) 
        {
            throw new InvalidEmpId("Invalid Employee ID!! It should be between 2001 and 5001");
        }
    }

    static void validateName(String name) throws InvalidName
     {
        if(name.isEmpty() || !Character.isUpperCase(name.charAt(0))) {
            throw new InvalidName("Invalid Name!! It should start with a capital letter");
        }
    }

    static void validateDeptId(int dept_id) throws InvalidDept
     {
        if(dept_id<1 || dept_id>5) {
            throw new InvalidDept("Invalid Department ID!! It should be between 1 and 5");
        }
    }
}

class Program16 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int n=sc.nextInt();
        Employee arr[]=new Employee[n];

        for(int i=0;i<n;i++) {
            int employee_id,dept_id;
            String name;

            while(true) {
                try {
                    System.out.println("Please enter your employee ID:");
                    employee_id=sc.nextInt();
                    Employee.validateEmpId(employee_id);
                    break;
                } catch(InvalidEmpId e) {
                    System.err.println(e.getMessage());
                }
            }
            sc.nextLine();  
            while(true) {
                try {
                    System.out.println("Please enter your name:");
                    name=sc.nextLine().trim();
                    Employee.validateName(name);
                    break;
                } catch(InvalidName e) {
                    System.err.println(e.getMessage());
                }
            }
            while(true) {
                try {
                    System.out.println("Please enter your department ID:");
                    dept_id=sc.nextInt();
                    Employee.validateDeptId(dept_id);
                    break;
                } catch(InvalidDept e) {
                    System.err.println(e.getMessage());
                }
            }
            arr[i]=new Employee(employee_id,name,dept_id);
        }
        System.out.println("********************************");
        for(int i=0;i<n;i++) {
            arr[i].display();
            System.out.println("********************************");
        }

        sc.close();
    }
}
