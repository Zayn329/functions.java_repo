import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();


        System.out.println("enter 2 integersS");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
       int sum= add(num1,num2);
        namepr(name);
        System.out.println("addition of :"+num1+" and " +num2 +" ="+sum);
        fact f1=new fact();
        int fact= f1.fact_wo(5);
        System.out.println(fact+"is the factorial of thegiven number which is 5 ");
    }
    public static void namepr(String name)
    {
        System.out.println("name :" +name);//since there are no place holders and commas dont work for print statement
        //like cpp we use + opertor for strings
        return;//it can work without return keywords as well
    }
    public static int  add(int num1,int num2)
    {
        int num3=num1+num2;

        return num3;
    }
}