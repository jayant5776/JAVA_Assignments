import java.util.Scanner;

class Prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd value : ");
        int b = sc.nextInt();
        int flag = 0;

        for(int i = a; i<=b; i++)
        {

            for (int j = 2;j <= i/2; ++j){
                if (i % j == 0){
                    flag = 1;
                    break;
                }
           }

           if (flag == 0){
               System.out.println(i);
           }

        }

    }
}