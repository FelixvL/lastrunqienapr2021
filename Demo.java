class Demo{  // GI                
	public static void main(String[] args){
		System.out.println("start");
		Groen g = new Groen();
		switch(g.rood.a){
			default:
				System.out.println("in default");
			case 34:
				System.out.println("in 34");
		}
		System.out.println("kleur");
		g.rood.a();
	}	
}
class Groen{
	final static LightRood rood = null;
	Groen(){
		System.out.println("Green");
	}
}
class Rood{
	static long a = 34;
	Rood(){
		System.out.println("Blauw");
	}
	int a(){
		System.out.println("lightrood");
		return 66;
	}
}
class LightRood extends Rood{
	static long a = 35;
	int a(){
		System.out.println("rood");
		return 88;
	}
}