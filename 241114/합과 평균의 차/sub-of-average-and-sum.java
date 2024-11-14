import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum; 
        sum = a + b + c;
        int average = sum/3;
       
        System.out.println(sum + "\n" + average + "\n" + (sum - average));
    }
}