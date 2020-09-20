import java.util.Scanner;

class Diagonal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows : ");
        int n = sc.nextInt();
        int arr[][] = new int[n][];
        for (int i = 0;i<arr.length;i++)
        {
            System.out.println("Enter cols for "+i);
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            for (int j = 0;j<arr[i].length;j++)
            {
                System.out.println("Enter element : ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements of an array : ");

        for(int ar[] : arr){
            for (int a : ar){
              System.out.print("     "+a);
            }
            System.out.println("");
        }

        System.out.println("Sum of an Diagonal elements : ");

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<=i;j++){
                sum = sum + arr[i][j];
            }
        }

        System .out.print("   "+sum);

    }
}