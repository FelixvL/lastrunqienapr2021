class Demo{  // DE
	public static void main(String[] args){
		System.out.println(Simpel.hoi);

	}
}
class Simpel{
	static String hoi = "No";
	static int r = gaan();
	void gaan(int a){
		System.out.println("Maybe");
	}
	int gaan(){
		System.out.println("Yes");
		return 7;
	}
}

