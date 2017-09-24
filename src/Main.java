import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = 0;
        System.out.print("請輸入正整數：");
        Scanner sc=new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println(num+" 是偶數！");
        else
            System.out.println(num+" 是奇數！");



    }
}
