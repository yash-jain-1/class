import java.util.*;
public class LabA2 {
    static int add(int a,int b){
        return a+b;
    }
    static int subtract(int a,int b){
        return a-b;
    }
    static int multiply(int a,int b){
        return a*b;
    }
    static int divide(int a,int b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("What operation do you want to perform ?  ");
        System.out.println("1-addition:add(a,b)");
        System.out.println("2-subtraction:subtract(a,b)");
        System.out.println("3-multiplication:multiply(a,b)");
        System.out.println("4-division:divide(a,b)");
        Scanner in= new Scanner(System.in);
        int p=in.nextInt();
        if(p==1){
            System.out.println("Enter the nos.");
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(add(a,b));
    }
        else if (p==2) {
            System.out.println("Enter the nos.");
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(subtract(a,b));

        } else if (p==3) {
            System.out.println("Enter the nos.");
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(multiply(a,b));

        }else if(p==4){
            System.out.println("Enter the nos.");
            int a=in.nextInt();
            int b=in.nextInt();
            System.out.println(divide(a,b));
        }
        else {
            System.out.println("Write a valid no.");
        }


    }


    }
