class Demo{  // FC                  
	public static void main(String[] args){
		System.out.println("Beginnen");
		Voorstelling v = new Voorstelling();
		Doorgang d = v.zetten();
		double w = d.proberen();
		System.out.println(w);
	}	
}


abstract class Aanvang{
	float proberen(){
		System.out.println("proberen in Aanvang");
		return 5.3;
	}
}

class Doorgang extends Aanvang{

}

class Voorstelling{
	Doorgang zetten(){
		return new Doorgang();
	}
}