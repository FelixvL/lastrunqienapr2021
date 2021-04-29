class Demo{  //    AS
	public static void main(String[] args) {
		lopen();
	}
	static void lopen(){
		System.out.println("in lopen");
		new Fiets().fietsen(6);
	}
}

class Fiets{
	void fietsen(int getal){
		System.out.println(getal+getal+"fietsen");
	}
}

