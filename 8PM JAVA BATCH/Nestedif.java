class Nestedif{


public static void main(String[] args)
{
java.util.Scanner scn=new java.util.Scanner(System.in);
System.out.println("Enter 1st number");
int a=scn.nextInt();
//Nested if
if(a%2==0)
{
System.out.println(a+" is divisible by 2 ");

if(a%5==0)
{
System.out.println(a+" is divisible by 2 and 5");


}


}else{
System.out.println(a+" is not divisible by 2 and 5");


}



}
}