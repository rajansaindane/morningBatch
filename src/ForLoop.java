import java.util.Scanner;

/**
 * Created by rajan on 3/8/17.
 */
public class ForLoop {
    int a;
    Scanner scanner=new Scanner(System.in);

    void switchcheck()
    {
        System.out.println("enter the value of a :");
        a=scanner.nextInt();



            switch (a) {

                case 1:
                    if (0<a && a<=40) {
                        System.out.println("hello");
                        break;
                    }

                case 2:
                    System.out.println("good");
                    break;

                case 3:
                    System.out.println("hiii");
                    break;

                default:
                    System.out.println("invalid");

            }
        }

        void arith()
        {
            int a,b=0,c=0;
            a=b+c++;
            System.out.println("value of a is : "+a);
        }
    void  whileCheck()
    {
        int i=0;
        while (i<=10)
        {
            System.out.println(i);
            ++i;
            System.out.println("i :"+i);
        }
    }

    void forEach()
    {
        String[] arr={"1","2","3","4","5","6"};
        for (String a:arr)
        {
            System.out.println(a);
        }
    }



    public static void main(String[] args) {

        ForLoop forLoop=new ForLoop();
        forLoop.switchcheck();
        forLoop.forEach();
        forLoop.whileCheck();
        forLoop.arith();
        int a;
        for (a = 0; a <=4 ; a++) {

            for (int m=4;m>=a;m--)
            {
                System.out.print(" ");
            }
                for (int b = 0; b <= a; b++) {
                    System.out.print(" *");

//                    for (int k = 0; k < a; k++) {
//                        System.out.print("");
//                    }

                }

            System.out.println("");

        }
    }
}
