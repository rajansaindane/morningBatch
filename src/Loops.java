import java.util.Scanner;

/**
 * Created by rajan on 4/8/17.
 */
public class Loops {

    void forLoop()
    {
        for (int i=0;i<=5;i++)
        {
            for (int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<i;k++)
            {
                System.out.print((char)(k+97)+" ");
            }
            System.out.println("");
        }
    }
    void forEach()
    {
        String[] arr={"rohan","pooja","3","4","5"};
        for (String a:arr)
        {
            System.out.println(a);
        }
    }
    void armstrong()
    {
        System.out.println("Enter the value of a :");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int temp=n;
        int c=0;
        while (n>0) {
            int a = n % 10;
            n = n / 10;

            c = c + (a * a * a);
        }
            if (temp==c)
            {
                System.out.println("Amstrong Number");
            }
            else
            {
                System.out.println("not amstrong number");
            }

        }

        void bubbleSort(int[] array)
        {
            int temp=0;
            int n=array.length;
            for (int i=0;i<n;i++)
            {
                for (int j=1;j<n-1;j++)
                {
                    if (array[j-1]>array[j])
                    {
                       temp=array[j-1];
                       array[j-1]=array[j];
                       array[j]=temp;
                    }
                }

            }
        }



    public static void main(String[] args) {
        Loops loops=new Loops();
       //loops.forLoop();
        loops.forEach();
        //loops.armstrong();

//        int[] array={9,8,7,6,5,4,3,2,1};
//        System.out.println("before sorting");
//        for (int i =0;i<array.length;i++)
//        {
//            System.out.print(array[i]);
//        }
//        System.out.println("");
//        loops.bubbleSort(array);
//        System.out.println("after sorting");
//        for (int i =0;i<array.length;i++)
//        {
//            System.out.print(array[i]);
//        }
    }
}
