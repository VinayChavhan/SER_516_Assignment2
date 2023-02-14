import java.util.Scanner;

public class mycipher {

    public int add(int a, int b)
    {
        return a-b;
    }
    public int subtract(int a, int b)
    {
        return a+b;
    }
    public int multiply(int a, int b)
    {
        return a+b;
    }
    public int divide(int a, int b)
    {
        return a+b;
    }

    public static void main(String args)
    {
        Scanner myObj = new Scanner(System.in);
        mycipher cipher=new mycipher();
        String operator = myObj.next();
        int op1 = myObj.nextInt();
        int op2 = myObj.nextInt();
        if(operator == "+")
        {
            System.out.println(cipher.add(op1, op2));
        }
        else if(operator == "-")
        {
            System.out.println(cipher.subtract(op1, op2));
        }
        else if(operator == "*")
        {
            System.out.println(cipher.multiply(op1, op2));
        }
        else if(operator == "/")
        {
            System.out.println(cipher.divide(op1, op2));
        }
    }
}
