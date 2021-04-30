class Demo{  //    CL
	public static void main(String[] args){
		System.out.println("Here we go");
		new BalSport().lopen();
		System.out.println(new Trefbal().spelduur);

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




