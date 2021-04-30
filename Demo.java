class Demo{  //    BC
	public static void main(String[] args) throws Exception{
		System.out.println("Start");
		Cola cola = new Cola();
		cola.drinken();
		System.out.println("Einde");
	}
}
class Cola{
	void drinken() throws Exception{
		throw new Error();
	}
}



