class NBSBeaty
{
    public static void main(String []args)
    {
        int i;
        System.out.println("*********************FOR LOOP*****************");
        for(i = 1; i <= 5; i++){
            System.out.println(i + " NBS");
        }
        i = 1;
        while(i <= 5){
            System.out.println(i + " NBS");
            i++;
        }

        System.out.println("*********************DO LOOP********************");
        i = 1;
        do{
            System.out.println(i + " NBS");
            i++;
        }while(i <= 5);
        
    }
}