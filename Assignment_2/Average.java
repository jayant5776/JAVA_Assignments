import java.util.Scanner;

class Average{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[10];
        int sum = 0;

        for (int i = 0; i<ar.length; i++)
        {
          
            ar[i] = sc.nextInt();
        }

        for (int i=0; i<ar.length; i++){
            sum = sum + ar[i];
        }

        System.out.println("Sum of all numbers : "+sum);

        int avg = sum / ar.length;
       
        System.out.println("Avg of all numbers : "+avg);

    }
}