public class GFGMdee {
    static String Employee_name;
    static float Employee_salary;
    static void set(String n, float p){
        Employee_name = n;
        Employee_salary = p;
    }
    static void get(){
        System.out.println("Employee Name: " + Employee_name);
        System.out.println("Employee CTC: " + Employee_salary);
    }

    public static void main(String[] args){
        GFGMdee.set("Munir Mdee",10000);
        GFGMdee.get();
    }
}
