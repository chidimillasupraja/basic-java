class Object1{
	static int age = 30;
	String name = "pari";
	public String walk(){
		return "Walking";
	}
	public static int time(){
		return 11;
	}
	public String eat(){
		return "eating";
	}
	public static void main(String [] args){
		Object1 d1 = new Object1();
		System.out.println(d1.walk());
		System.out.println(time());
		System.out.println(d1.eat());
		System.out.println(age);
		System.out.println(d1.name);
		
	}
}
