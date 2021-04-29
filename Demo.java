class Demo{  //    AR
	public static void main(String[] args) {
		lopen();
	}
	static void lopen(){
		System.out.println("in lopen");
		new Fiets().fietsen(4);
	}
}

class Fiets{
	void fietsen(int getal){
		System.out.println("fietsen in fiets"+getal+getal);
	}
}

