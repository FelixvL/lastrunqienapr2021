class Demo{  // GD                
	public static void main(String[] args){
		System.out.println("start");
		Groen g = new Groen();
		System.out.println(g.rood.a);
		System.out.println("kleur");
		g.rood.a();
	}	
}

class Groen{
	LightRood rood;
}

class Rood{
	static int a = 34;
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