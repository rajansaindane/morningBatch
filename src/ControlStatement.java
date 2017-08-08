import java.util.Scanner;

/**
 * Created by rajan on 3/8/17.
 */
public class ControlStatement {
    int a,b;

    void check() {
        System.out.println("enter value of a : ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if (a==10) {
            System.out.println("correct value");

        } else {
            System.out.println("wrong");
        }

    }

    void multiCheck()
    {

        System.out.println("enter % of student : ");
        Scanner scanner = new Scanner(System.in);
        b = scanner.nextInt();
        if (b<40)
        {
            System.out.println("fail");
        }
        else if (b>=40 && b<=60)
        {
            System.out.println("second class");
        }
        else if (b>=60 && b<=70)
        {
            System.out.println("first class");
        }
        else if (b>70)
        {
            System.out.println("distinction");
        }
        else
        {
            System.out.println("invalid input");
        }

    }

    public static void main(String[] args) {


        ControlStatement controlStatement = new ControlStatement();
        //controlStatement.check();
        controlStatement.multiCheck();

    }
}
