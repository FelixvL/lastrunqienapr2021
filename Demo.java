class Demo{  //    AH
	public static void main(String[] args) {
		lopen(new Fiets());
	}
	static void lopen(Fiets bike){
		System.out.println("in lopen");
		bike.snelheid = new Fiets().fietsen(6);
		System.out.println(">>"+bike.snelheid);
		fiets.fietsen(9);
	}
}

class Fiets{
	int snelheid = 3;
	int fietsen(int snelheid){  // getal
		System.out.println("fietsen met "+snelheid);
		return 7;
	}
}

