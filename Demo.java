class Demo{  // FM                
	public static void main(String[] args){
		System.out.println("Beginnen");
		Voorstelling v = new Voorstelling();
		Doorgang d = v.zetten();
		double w = 0;
		try{
			w = d.proberen();
		}catch(Zomaar z){
			System.out.println("caught");
		}
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
	double proberen()throws Zomaar{
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