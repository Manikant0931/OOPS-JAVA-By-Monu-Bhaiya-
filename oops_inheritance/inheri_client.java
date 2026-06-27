package oops_inheritance;
public class inheri_client {
    public static void main(String[] args) {
        //case1
//         parent obj1 = new parent();
//         System.out.println("CASE 1");
//         System.out.println(obj1.d);    // 1
//         System.out.println(obj1.d1);   // 10
//         obj1.fun();    // Fun in P
//         obj1.fun1();   // Fun1 in P
//         System.out.println();
//     }
// }
        //case2
//         parent obj2 = new child();
//         System.out.println("CASE 2");
//         System.out.println(obj2.d);    // 1 (Reference Type P)
//         System.out.println(obj2.d1);   // 10
//         obj2.fun();    // Fun in C (Object Type C)
//         obj2.fun1();   // Fun1 in P
//         // obj2.d2;      // Compile Time Error
//         // obj2.fun2();  // Compile Time Error
//         System.out.println();
// }
// }

//-----------------------------------------------------------------------|
        //case3                                                          |
        // child obj3 = new parent();                                    |
        // Compile Time Error                                            |
        // Parent cannot be stored in Child reference                    |  
        // NOTE:-                                                        |                  |
        //3rd case of inheritance is not possible because parent class   |
        // does not have the properties of child class. So, we cannot    |
        // create an object of parent class and store it in child        |
        // reference variable. This will give a compile time error.      |
//-----------------------------------------------------------------------|

        //case4
//         child obj4 = new child();
//         System.out.println("CASE 4");
//         System.out.println(obj4.d);    // 2
//         System.out.println(obj4.d1);   // 10
//         System.out.println(obj4.d2);   // 20
//         obj4.fun();    // Fun in C
//         obj4.fun1();   // Fun1 in P
//         obj4.fun2();   // Fun2 in C
//         System.out.println();
//     }
// }

        // DOWNCASTING
//         System.out.println("DOWNCASTING");
//         child obj2 = new child();
//         System.out.println(((child)obj2).d);   // 2
//         System.out.println(((child)obj2).d2);  // 20
//         ((child)obj2).fun2();                  // Fun2 in C
//         System.out.println();
//     }
// }

        // INVALID DOWNCASTING
//         parent obj5 = new parent();
//         child obj6 = (child)obj5; //error: java.lang.ClassCastException: oops_inheritance.parent cannot be cast to oops_inheritance.child
    }
}