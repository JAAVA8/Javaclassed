class Addnumber{


//Method Overloading in java
public static int add(int a,int b){

return a+b;
}
public static int add(int a,int b,int c){

return a+b+c;
}
public static double add(double d1,double d2){
return d1+d2;
}


public static void main(String[] args)
{
System.out.println(add(7,5));
System.out.println(add(34.54,65.38));
System.out.println(add(4,6,2));
}
}