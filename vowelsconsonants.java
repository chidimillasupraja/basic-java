class Vowelsconsonants{
public static void main(String[] args){
String name="namoshivayya";
int n1=name.length();

String n=name.toLowerCase();
int vowcount=0;
int concount=0;
for(int i=0;i<name.length();i++){
char ch=name.charAt(i);
if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='n'){
vowcount++;
}
else{
concount++;
}
}
System.out.println("vowels "+vowcount+" "+n1);
System.out.println("consonant"+concount);
}
}
