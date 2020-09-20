import java.util.Scanner;

class SmallLarge{
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

        int max = arr[0][0];
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                  if(arr[i][j]>max)
                  {
                      max = arr[i][j];
                  }
            }
        }

        System.out.println("max of all numbers : "+max);
    }
}