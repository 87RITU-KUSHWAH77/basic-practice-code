import java.time.Year;
import java.util.*;
public class Day_1{
    public static void main(String[] args) {     
        Scanner Sc = new Scanner(System.in);

        // BASUC CALCULATOR USING JAVA 
        
            System.out.println("Enter your First number:");
            int num_1 = Sc.nextInt();
            System.out.println("Enter your Second number:");
            int num_2 = Sc.nextInt();

            System.out.println("your first number:" + num_1);
            System.out.println("your Second number:" + num_2);
            

            System.out.println("+ , - , * , /");
            System.out.println("Enetr the valid option in above list...");
            char op = Sc.next().charAt(0);

            switch (op) {
                case '+':
                    System.out.println("Add : " + num_1+num_2);
                    break;
                // case '-':
                //     System.out.println("Sub : " + num_1-num_2);
                //     break;    
                case '*':
                    System.out.println("mul : " +num_1*num_2);
                    break;    
                case '/':
                    System.out.println("div : " +num_1/num_2);
                    break;
                default:
                    break;
            }

        //     // Assignment Day-1 

            // 1
            int age = 20;
            float height = 5.6f;
            Double salary = 1560000000000000000000000.00;
            boolean is_working = true;
            char gender = 'f';

            System.out.println("Age :" + age);
            System.out.println("Height :"+ height);
            System.out.println("salary :" + salary);
            System.out.println("IsWorking :" + is_working);
            System.out.println("Gender :" +gender);


            // 2 swap with or without third var
            int a = 5;
            int b = 6;
            System.out.println("a :" +a);
            System.out.println("b :" +b);
            
            // method-1
            int temp = a;         // temp var logic
            a = b;
            b = temp;

            // method-2
            a = a+b;  //  a -> 11
            b = a-b;  //  b -> 11-6 = 5  with swap
            a = a-b;  // a -> 11-5 = 6  with swap  
            System.out.println("a :" +a);
            System.out.println("b :" +b);


        //    // 3 area of circle 
            System.out.println("enter the radius:");
            float r = Sc.nextFloat();

            float area = (float) (Math.PI*r*r);
            System.out.println("Area of a Circle :" + area);

            // 4 Salary double 
            double salary = 2500000.0;
            System.out.println("your updated Salary:" + (int)(salary*2));

        //     // 5
            char name  = 'A';
            System.out.println(name+2);

        // Day - 2 practice Question

        // //1 even/odd
        System.out.print("Enter the Number:");
        int num = Sc.nextInt();

        if(num%2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }

        //2 max of 3
        System.out.print("Enter the first Number:");
        int n1 = Sc.nextInt();
        System.out.print("Enter the second Number:");
        int n2 = Sc.nextInt();
        System.out.print("Enter the third Number:");
        int n3 = Sc.nextInt();
        
        if(n1>n2 && n1>n3){
            System.out.println(n1+" First number is max");
        }else if(n2>n1 && n2>n3){
            System.out.println(n2+" Second number is max");
        }else{
            System.out.println(n3+" third number is max");
        }

        //3 num is positive, negative, or zero
        System.out.println("Enter any Number : ");
        int value = Sc.nextInt();
        if(value==0){
           System.out.println("Your Number is Zero! ");  
        }else if(value>0){
            System.out.println("Your Number is Positive! ");
        }else{
            System.out.println("Your Number is Negative! ");
        }

        //Q4: Leap Year Checker
        System.out.println("Enter the year:");
        int year = Sc.nextInt();

       if((year%400==0 || year%100!=0) && year%4==0){
        System.out.println("this year is the Leap year:"+year);
       }else{
        System.out.println("this year not is not a Leap year:"+year);
       }

    // Q5: Simple Calculator (Menu-Driven)
    System.out.print("Enter the first Number:");
    int num1 = Sc.nextInt(); 
    System.out.print("Enter the first Number:");
    int num2 = Sc.nextInt(); 
    System.out.print("Enter the operator: +, -, *, /, %");
    char op = Sc.next().charAt(0);
    
    switch (op) {
        case '+':
            System.out.println("Add : " + (num1+num2));
            break;
        case '-':
            System.out.println("Sub : " + (num1-num2));
            break;
        case '*':
            System.out.println("mul : " + (num1*num2));
            break;
        case '%':
            System.out.println("mod : " + (num1%num2));
            break; 
        case '/':
            System.out.println("Div : " + (num1/num2));
            break;           
        default:
            System.out.println("Enter the valid Operation");
            break;
    }

        //5 Grade
        System.out.println("enter physics mark:");
        float phy = Sc.nextFloat();
        System.out.println("enter Chemistry mark:");
        float che = Sc.nextFloat();
        System.out.println("enter Math mark:");
        float math = Sc.nextFloat();

        float per = ((phy+che+math) / 300.0f) * 100;
        System.out.print("You Score:" + per + "%");

        if(per>=90){
            System.out.print(" With Grade: A+");
        }else if (per >= 75) {
            System.out.print(" With Grade: B+");
        }else if (per >= 60) {
            System.out.print(" With Grade: c");
        }else if(per >= 33){
            System.out.println("Fail");
        }else{
            System.out.println("invalid marks");
        }

       Sc.close();

    }
}