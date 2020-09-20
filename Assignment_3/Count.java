import java.util.Scanner;

class Count{
    public static void main(String args[]){
        int count = 0;
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

        for(int ar[] : arr){
            for (int a : ar){
             if(a != 0){
                 count++;
             }
            }
        }

        System.out.println("total Elements : "+count);
    }
}