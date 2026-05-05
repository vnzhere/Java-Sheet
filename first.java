import java.util.Scanner;
public class first{
    public static void main(String[] args){

        // // What does args do?
        // System.out.println(args[0]);
    //    java first.java hello
        // hello in terminal line got saved in args and then printed along with hello world
//         System.out.println("Hello World!");
// // my name is --0,1,2
//          System.out.println(args[0]);
//           System.out.println(args[1]);
//            System.out.println(args[2]);

Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
// we can give floating point input also 
System.out.println("Hello People " + a);


    }
}