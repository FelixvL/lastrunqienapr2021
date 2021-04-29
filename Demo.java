class Demo{  //    AX
	public static void main(String[] args) {
		lopen(new Fiets());
	}
	static void lopen(Fiets bike){
		System.out.println("in lopen");
		bike.snelheid = new Fiets().fietsen(6);
		System.out.println(">>"+bike.snelheid);
		bike.fietsen(9);
	}
}

class Fiets{
	int snelheid = 3;
	static int fietsen(int snelheid){  // getal
		System.out.println("fietsen met "+snelheid);
		return 8;
	}
}

