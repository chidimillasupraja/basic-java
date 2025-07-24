class Admission{
public static void main(String[] args){
int percentage=89;
boolean sportsCertificate=false;
int familyincome=200000;
boolean volunteeExperience=false;
if(percentage>=90 && sportsCertificate==true && familyincome<=200000)
System.out.println("full scholarship");
else if(percentage>=85 && sportsCertificate==true && volunteeExperience==true)
System.out.println("partial scholarship");
else
System.out.println("no scholarship");
}
}