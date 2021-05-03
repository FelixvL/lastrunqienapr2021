class Demo{  // DG
	public static void main(String[] args){
		new Simpel();
		new Simpel();
		System.out.println(new Simpel().r);

	}
}
class Simpel{
	static String hoi = "No";
	static int r = gaan();
	void gaan(int a){
		System.out.println("Maybe");
	}
	static int gaan(){
		System.out.println("Yes");
		return 7;
	}
}

