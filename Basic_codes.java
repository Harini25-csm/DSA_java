import java.util.Scanner; //util is the package(folder), scanner is className (file)
public class Basic_codes { //classname --> 'Code'(should start with capital letter)
    public static void main(String[]args){ 
        /*method --> 'main'(the entry point of java)
         * static---> keyword is accessable everywhere used before variable
         * method ; public---> access modifier
         * to convert the arg into str -> str[]args
        */
        
        // // className variableName = new className
        // Scanner sc=new Scanner(System.in); 
        // System.out.print("Enter your name:");
        // // datatype variable = sc.next() (next() for single word, nextLine() for sentence)
        // String name=sc.nextLine();
        // System.out.print("Enter your age:");
        // int age=sc.nextInt();
        // double d=25.32;
        // long l=1234567890L;
        // System.out.println("\nNames:"+name);
        // System.out.println("Age:"+age);
        // System.out.println("Double:"+d);
        // System.out.println("Long:"+l);
        // sc.close();

        /*---------------------------------------------------------------*/
        // //Primitive data types
        // boolean a=true;
        // byte by=-128;
        // short sh=32767;
        // char ch='a';
        // int in=212;
        // long lo=122465687908l;
        // double dou=6357625252.27328687873;

        /*---------------------------------------------------------------*/
        // //Operators

        // int a=12;
        // int b=5;
        // int sum=a+b;

        // System.out.println("Sum:"+sum);
        // System.out.println("Diff:"+(a-b));

        // float div=a/b;//quotient
        // System.out.println("Div:"+div);
        // int mod=a%b;//remainder
        // System.out.println("Mod:"+mod);
        // int mul=a*b;
        // System.out.println("Mul:"+mul);

        // if(a>b){
        //     System.out.println("A is greater than B");
        // }
        // else{
        //     System.out.println("B is greater than A");
        // }

        /*---------------------------------------------------------------*/

        // boolean icecream=false;
        // boolean chocolate=true;
        // boolean toys=true;

        // if (icecream && chocolate && toys){
        //     System.out.println("I am happy");
        // }else{
        //     System.out.println("I am sad");
        // }

        // if (icecream || chocolate || toys){
        //     System.out.println("I am happy");
        // }else{
        //     System.out.println("I am sad");
        // }

        // if (!icecream){
        //     System.out.println("I am happy");
        // }else{
        //     System.out.println("I am sad");
        // }

        /*---------------------------------------------------------------*/
        // //Increment and Decrement Operators
        // int a=10;
        // int b=0;

        // b=a++;
        // System.out.println("a:"+a);
        // System.out.println("b:"+b);
        
        // b=a--;
        // System.out.println("a:"+a);
        // System.out.println("b:"+b);

        // b=++a;
        // System.out.println("a:"+a);
        // System.out.println("b:"+b);

        // b=--a;
        // System.out.println("a:"+a);
        // System.out.println("b:"+b);

        /*---------------------------------------------------------------*/

        // //Ladder
        // int a=10;
        // int b=2;

        // if(a>b){
        //     System.out.println(a);
        // }


        // //Switch case
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter your chocie:");
        // int button=sc.nextInt();
        // System.out.print(button);
        // switch(button){
        //     case 1:
        //         System.out.println("Hello");
        //         break;
        //     case 2:
        //         System.out.println("Namasthe");
        //         break;
        //     case 3:
        //         System.out.println("Konnichiwa");
        //         break;
        //     default:
        //         System.out.println("Invalid button");
                
        // }


        // //Ternary operator
        // int age=18;
        // System.out.println((age>=18) ? "Eligible to vote" : "Not eligible to vote");

        // //Nested loop
        // for(int i=1;i<=3;i++){
        //     for(int j=1;j<=3;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

    
    }
       
}
