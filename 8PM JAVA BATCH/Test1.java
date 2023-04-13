//Method or Function


class Test1{
//Syntax

public static void Method1(String name,long l){


System.out.println("Name="+name+",Mob="+l);
}



public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter name");
String n=scn.next();
System.out.println("Enter Mob");
long l=scn.nextLong();
Method1(n,l);

Method2();
}
public static void Method2(){

int age=31;
System.out.println("Age="+age);
}
}