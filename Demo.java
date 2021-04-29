class Demo{  //    AL
	public static void main(String[] args) {
		lopen();
	}
	static void lopen(){
		System.out.println("in lopen");
		Fiets fiets = new Fiets().fietsen(6);
		fiets.fietsen(9);
	}
}

class Fiets{
	int fietsen(int getal){
		System.out.println(getal+"fietsen");
		return 7;
	}
}

