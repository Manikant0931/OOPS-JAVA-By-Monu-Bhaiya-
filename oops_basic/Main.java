public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Mohini";
        s.age = 20;
        s.Intro_yourSelf();
        Student s1 = new Student();
        s1.name = "Hunir";
        s1.age = 25;
        s1.Intro_yourSelf();
        s.SayHey("Rahul"); //paramater has the higher priority
        Student.fun();
        s.fun();
        s1.fun();
    }
}