class Demo{  // FI                 
	public static void main(String[] args){
		System.out.println("Beginnen");
		Voorstelling v = new Voorstelling();
		Doorgang d = v.zetten();
		double w = d.proberen();
		System.out.println(w);
	}	
}


abstract class Aanvang{
	double proberen()throws Exception{
		System.out.println("proberen in Aanvang");
		return 5.6;
	}
}

class Doorgang extends Aanvang{
	double proberen(){
		System.out.println("proberen in Doorgang");
		throw new Zomaar();
	}
}

class Voorstelling{
	Doorgang zetten(){
		return new Doorgang();
	}
}
class Zomaar extends Exception{}