class Demo{  // GY                
	public static void main(String[] args){
		Groen g = new Groen();
		g.rood = new LightRood();
		System.out.println(g.rood.a);
		System.out.println("kleur");
	}	
}

class Groen{
	Rood rood;
}

class Rood{
	int a = 34;
}

class LightRood extends Rood{
	int a = 35;
}