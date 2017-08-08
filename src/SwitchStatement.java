import java.util.Scanner;

/**
 * Created by rajan on 4/8/17.
 */
public class SwitchStatement {

    void checkSwitch()
    {
        Scanner scanner=new Scanner(System.in);

        int num;
        num=scanner.nextInt();
        switch (num)
        {
            case 4:
                System.out.println("hiii");



            case 1:
                System.out.println("hello");



            case 2:
                System.out.println("bye");



        }
    }

    public static void main(String[] args) {
        SwitchStatement switchStatement=new SwitchStatement();
        switchStatement.checkSwitch();
    }
}
