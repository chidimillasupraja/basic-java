class Static_Variables{
static String clg_name="vaagdevi college of engineering";
String name;
int age;
public Static_Variables(String stu_name,int stu_age){
name=stu_name;
age=stu_age;
System.out.println("name:"+name);
System.out.println("age:"+age);
System.out.println("clg_name:"+clg_name);
}
}
public static void main(String[] args){
Static_Variables v1=new Static_Variables("supraja",21);
Static_Variables v2=new Static_Variables("navinder",23);
Static_Variables v3=new Static_Variables("harika",24);
}
}

