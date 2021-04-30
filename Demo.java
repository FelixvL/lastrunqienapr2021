class Demo{  //    CN
	public static void main(String[] args){
		System.out.println("Here we go");
		Sport s = new Trefbal();
		BalSport b = (BalSport)s;
		b.gooien();
		s.gooien();
		System.out.println(s.spelduur);
		System.out.println(b.spelduur);
	}
}
class Trefbal extends BalSport{
	int spelduur = 8;
	void gooien(){
		System.out.println("a"+spelduur);
	}
}

class BalSport extends Sport{
	int spelduur = 6;
	void lopen(){
		System.out.println("lopen"+spelduur);
	}
}
abstract class Sport{
	int spelduur = 4;
	void gooien(){
		System.out.println("Ik ben voor Sport"+spelduur);
	}
}




