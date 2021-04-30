class Demo{  //    CC
	public static void main(String[] args){
		System.out.println("Here we go");
		float r = 3.4f;
		Trefbal tb = new Trefbal();
		tb.gooien(r);
		System.out.println("AF!");
	}
}
class Trefbal{
	void gooien(double t){
		System.out.println("a");
	}
	int gooien(int s){
		System.out.println("b");
		return 7;
	}
}




