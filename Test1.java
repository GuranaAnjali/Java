class poly{
	public void m(){
		System.out.println("h1");
	}
	public void m(int n){
		System.out.println("m1");
	}
	public void m(String f){
		System.out.println("m1");
	}
	public void m(String e){
		System.out.println("m3");
	}
}
class Test1{
	public static void main(String [] a){
		
		poly obj = new poly();
		obj.m();
	}
}
