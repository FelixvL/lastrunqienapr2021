class Demo{  // GA                
	public static void main(String[] args){
		Groen g = new Groen();
		g.rood = new LightRood();
		System.out.println(g.rood.a);
		System.out.println("kleur");
		g.rood.a();
	}	
}

class Groen{
	Rood rood;
}

class Rood{
	int a = 34;
	static int a(){
		System.out.println("lightrood");
		return 66;
	}
}

class LightRood extends Rood{
	int a = 35;
	static int a(){
		System.out.println("rood");
		return 88;
	}
}