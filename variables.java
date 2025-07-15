class Variables{
int age=21;
static String name="manu";
public static void var(int a){
System.out.println(a);
}
public static void main(String[] args){
Variables v1=new Variables();
int marks=11;
v1.var(marks);
System.out.println(v1.age);
System.out.println(name);
}
}
