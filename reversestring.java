class Reversestring{
public static void main(String[] args){
String name="Supraja";
String rev="";
for(int i=0;i<name.length();i++){
rev=name.charAt(i)+rev;
}
System.out.println("reverse of string is"+rev);
}
}