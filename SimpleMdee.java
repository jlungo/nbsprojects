public class SimpleMdee {
	public static void main(String args[])
	{
		String s = "Sachin";
        s.concat(" Tendulkar");//concat() method appends the string 	at the end 
	    String t = s.concat(" Tendulkar");//concat() method appends the string 	at the end  
	    System.out.println(s);//will print Sachin because strings are I	mmutable objects  
        System.out.println(t);//will print Sachin Tendulkar because new variable t given both 

        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        System.out.println("****************By == Operator************************");//true
        System.out.println(s1 == s2);//true
        System.out.println(s1 == s3);//flase
        System.out.println("****************By compareTo() Method*****************");//true
        s1 = "Sachin";
        s2 = "Sachin";
        s3 = "Ratan";
        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//1
        System.out.println(s3.compareTo(s1));//-1
        System.out.println("**************** + Operator ***************************");//true
        //s = 50 + 30 + "Sachin" + " Tendulkar" + 40 + 40;
        s = "Sachin" + " Tendulkar";
        System.out.println(s);
        System.out.println("**************** By concat() **************************");//true
        s1 = "Sachin";
        s2 = " Tendulkar";
        s3 = s1.concat(s2);
        System.out.println(s3);
        System.out.println("*******************************************************");//true
        s1 = "Sachin";
        s2 = "SACHIN";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true
    }
    
}
