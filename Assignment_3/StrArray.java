import java.util.Scanner;

class StrArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = sc.nextInt();
        String str[] = new String[n];
        System.out.println("Enter elements of StrArray : ");

        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
        }

        for (String s : str){
            System.out.print("   "+s);
        }

    }
}