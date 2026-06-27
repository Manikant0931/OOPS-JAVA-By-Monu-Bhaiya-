public class Student {
    String name;
    int age;

    
    public void Intro_yourSelf() {
        System.out.println("My Name is " + name + " and age is " + age);
    }


    public void SayHey(String name) {
        System.out.println("Hey " + name);
    }


    static int count=10;
    public static void fun() {
        int x=20;
           System.out.println(count);
        System.out.println(x);
     
        System.out.println("I am in fun");    
    }


    //the topmost priority is of static block...
    static{
        System.out.println("welcome bete 1");
    }
    static{
        System.out.println("welcome bete 2");
    }
}