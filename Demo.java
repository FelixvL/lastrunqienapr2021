class Demo{  //    AZ
	public static void main(String[] args) {
		lopen();
	}
	static void lopen(){
		System.out.println("in lopen");
		new Fiets().fietsen(4);
	}
}

class Fiets{
	void fietsen(String getal){
		System.out.println("fietsen in fiets"+getal);
	}
}

