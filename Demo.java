class Demo{  // GE                
	public static void main(String[] args){
		System.out.println("start");
		Groen g = new Groen();
		System.out.println(g.rood.a);
		System.out.println("kleur");
		g.rood.a();
	}	
}

class Groen{
	final LightRood rood;
	Groen(){
		rood = new LightRood();
	}
}

class Rood{
	static int a = 34;
	Rood(){
		System.out.println("Blauw");
	}
	static int a(){
		System.out.println("lightrood");
		return 66;
	}
}

class LightRood extends Rood{
	static int a = 35;
	static int a(){
		System.out.println("rood");
		return 88;
	}
}