import java.util.Scanner;

class Table{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter table number : ");
        int n = sc.nextInt();

        for (int i = 1;i <= 10; i++)
        {
            int ans = n * i;
            System.out.println(ans);
        }
    }
}