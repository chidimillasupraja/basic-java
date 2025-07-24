class Passport{
public static void main(String[] args){
int age=15;
boolean hasPassport=false;
boolean hasNoCriminalRecord=true;
if (age>=18 &&  hasPassport==true && hasNoCriminalRecord==true)
System.out.println("eligible for visa");
else if(age>=18 && hasPassport==false && hasNoCriminalRecord==true)
System.out.println("apply for passport first");
else if(age<18 && hasNoCriminalRecord==true)
   System.out.print("not eligible");
}
}