class Demo{  // FA                  
	public static void main(String[] args){
		System.out.println("Beginnen");
		Voorstelling v = new Voorstelling();
		Doorgang d = v.zetten();
	}	
}


abstract class Aanvang{


}

class Doorgang extends Aanvang{

}

class Voorstelling{
	Aanvang zetten(){
		return new Doorgang();
	}
}