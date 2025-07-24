class Seasons{
public static void main(String[] args){
String month="dec";
String season="";
season =switch(month){
case "jan","feb","mar" -> "winter";
case "april","march","june" -> "summer";
case "july","aug","sep" -> "rainy";
case "oct","nov","dec" -> "monsoon";
default -> "invalid month";
};
System.out.println("season: " + season);
}
}