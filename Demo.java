class Demo{  // FB                  
	public static void main(String[] args){
		System.out.println("Beginnen");
		Voorstelling v = new Voorstelling();
		Doorgang d = v.zetten();
		d.proberen();
	}	
}


abstract class Aanvang{
	void proberen(){
		System.out.println("proberen in Aanvang");
	}
}

class Doorgang extends Aanvang{

}

class Voorstelling{
	Doorgang zetten(){
		return new Doorgang();
	}
}