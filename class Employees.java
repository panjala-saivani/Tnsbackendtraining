 class EmployeesMain {
    // instance variabels
    static class Employees {
        int empId;
        String ename;
        String esection;

        // static variable
        static String companyName = "Smile";

        // method
        void print() {
            //local variable
            String msg = "These are Smile employees";
            System.out.println(msg);
            System.out.println(empId + " " + ename + " " + esection + " " + companyName);
        }
    }

    public static void main(String[] args) {
        Employees e = new Employees();
        e.empId = 1;
        e.ename = "Diya";
        e.esection = "Packing";

        e.print();
        System.out.println("Employee works at " + Employees.companyName);
    }
}