class Stringpalindrome{
public static void main(String[] args){
String name="paPap";
String n=name.toLowerCase();
String rev="";
for(int i=0;i<name.length();i++){
rev=name.charAt(i)+rev;
}
System.out.println(rev);
if(rev.equals(name)){
System.out.println("is palindrome");
}else{
System.out.println("is not palindrome");
}
}
}

