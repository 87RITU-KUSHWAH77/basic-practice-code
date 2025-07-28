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

        //     // 1
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


        //     // 2 swap with or without third var
            int a = 5;
            int b = 6;
            System.out.println("a :" +a);
            System.out.println("b :" +b);
            
            int temp = a;         // temp var logic
            a = b;
            b = temp;

            a = a+b;  //  a -> 11
            b = a-b;  //  b -> 11-6 = 5  with swap
            a = a-b;  // a -> 11-5 = 6  with swap  
            System.out.println("a :" +a);
            System.out.println("b :" +b);


        //    // 3 area of circle 
            System.out.println("enter the radius:");
            float r = Sc.nextFloat();

            float area = Math.PI*r*r;
            System.out.println("Area of a Circle :" + area);

            // 4 Salary double 
            double salary = 2500000.0;
            System.out.println("your updated Salary:" + salary*salary);

        //     // 5
            char name  = 'A';
            System.out.println(name+2);






        Sc.close();
        
       

    }
}
