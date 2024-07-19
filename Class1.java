class Parent{
    void Print()
    {
        System.out.println("parent class");
    }
}

//Class2
class subclass1 extends 
Parent {
    void Print({System.out.println("subclass1");
    })
}

//Class3
class subclass2 extends 
Parent {
    void Print()
    {
    System.out.println("subclass2");
    })
}

//Class4
class GFGBeaty{
    public static void main(String[]args){
        Parent a;
        a=new subclass1();
        a.Print();

        a=new subclass2();
        a.Print();
    }
}
