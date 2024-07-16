class GFC{
    static String Employee_name;
    static Float Employee_salary;

    static void Set(String n, Float p) { 
        Employee_name = n;
        Employee_salary = p;
    }
    static void get() {
        System.out.println("Employee name is: " +Employee_name);
        System.out.println("Employee CTC is: " +Employee_salary);
    }
    public static void main (String[] args){
        GFC.Set ("Rathod Avinash", 1000.0f);
        GFC.get();
    }
}

    



