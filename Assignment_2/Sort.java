import java.util.Scanner;

class Sort{
    public static void main(String arg[]){
        int temp;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i=0; i<arr.length; i++){
            System.out.println("Enter element at index "+i+" ");
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){

            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

        }

        System.out.println("Descending Order : ");

        for (int i=0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}