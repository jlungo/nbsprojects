public class GFGBeaty {
    static String Employee_name;
    static float Employee_salary;
    static void set(String n, float p){
        Employee_name = n;
        Employee_salary = p;
    }
    static void get(){
        System.out.println("Employee Name is: " + Employee_name);
        System.out.println("Employee CTC is: " + Employee_salary);
    }

    public static void main(String args[]){
        GFGBeaty.set("Rathod Avinashillngham",10000.0f);
        GFGBeaty.get();
    }
}