class swapvaribles{

 public static void main(String[] args)
 {
int a=100;//200
int b=200;//100
//op- a=200 b=100
int temp;//100
temp=a;
a=b;
b=temp;
System.out.println(a);
System.out.println(b);
 }
}