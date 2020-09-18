import java.util.Scanner;

class RevArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter Array element : ");

        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for (int b:arr)
        {
            System.out.print(b);
        }
        System.out.println("");

        for (int i=arr.length;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}