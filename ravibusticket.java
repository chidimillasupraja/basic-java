class Ravibusticket{
public static void main(String[] args){
int distance=110;
String day="weekday";

if(distance<50)
System.out.println("fare is 50rupees");
else if(distance>=50 && distance<=100)
System.out.println("fare is 100rupees");
else if(distance>100 && day.equals("weekday"))
System.out.println("fare is 200rupees");
else if(distance>100 && day.equals("weekend"))
System.out.println("fare is 300rupees");

}
}