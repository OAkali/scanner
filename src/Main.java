import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("age:");
        int age = sc.nextInt();
        System.out.print("temp:");
        int temp =sc.nextInt();


            if(age > 20&& age < 48 && temp >-20 && temp <30 ){
                System.out.println("Можно гулять");
            }else if(age <20 && temp > 0 && temp < 28){
                System.out.println("Го гулять !!!!! ");
            } else if(age >45 && temp >-10 && temp < 25){
                System.out.println("Можно гулять");
            } else{
                System.out.println("Оставаться дома !");}



    }
}