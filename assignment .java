import java.util.*;
import java.lang.*;


class assignment {
public static void main(String args [])
{
System.out.println("TEST DATA ");
Scanner sc=new Scanner(System.in);
System.out.print("input first number");
int i=sc.nextInt();
System.out.print("input second number");
int j=sc.nextInt();

int c=i+j;
int d=i-j;
int e=i*j;



System.out.println("expected output");
System.out.println(i+ "+" +j+"="+c);
System.out.println(i+ "-" +j+"="+d);
System.out.println(i+ "*" +j+"="+e);
}
}
