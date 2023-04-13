class Info{


public static String name(String name){

return name;
}

public static int add(int a,int b){
int sum=a+b;
return sum;
}

public static String information(String name,int age){

return "Name-"+name+",Age-"+age;
}
public static void main(String[] args){

System.out.println("Name="+name("King"));

int sum=add(4,8);
System.out.println("sum="+sum);
System.out.println(information("Raj",21));
}

}