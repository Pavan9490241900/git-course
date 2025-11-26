import java.util.Scanner;

public class FirstCode{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{
            int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;

        System.out.println("Addition : "+c);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}