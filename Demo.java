class Demo{  //    CK
	public static void main(String[] args){
		System.out.println("Here we go");
		new Sport().lopen();

	}
}
class Trefbal extends BalSport{
	void gooien(){
		System.out.println("a");
	}
}

abstract class BalSport extends Sport{
	void lopen(){
		System.out.println("lopen");
	}
}
abstract class Sport{
	void gooien(){
		System.out.println("Ik ben voor Sport");
	}
}




