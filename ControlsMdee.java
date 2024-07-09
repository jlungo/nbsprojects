public class ControlsMdee {
    public static void main (String[] args){
        //Program to illustrate Control Structures
        System.out.println("****************FOR LOOP*************************");
        for(int i = 1; i <= 5; i++){
            System.out.println(i + " - National Bureau of Statistics (NBS)");
        }
        System.out.println("***************WHILE LOOP************************");
        int i = 1;
        while(i <= 5){
            System.out.println(i + " - National Bureau of Statistics (NBS)");
            i++;
        }
        System.out.println("***************DO LOOP***************************");
        i = 1;
        do{
            System.out.println(i + " - National Bureau of Statistics (NBS)");
            i++;
        }while(i <= 5);
        System.out.println("************IF....ELSE..IF....ELSE***************");
        i = 2;
        if(i == 1){
            System.out.println("I = " + i);
        }else if(i == 2){
            System.out.println("I = " + i);
        }else if(i == 3){
            System.out.println("I = " + i);
        }else{
            System.out.println("Something Else");
        }
        System.out.println("************************************************");
    }
}
