class Demo{  //    BD
	public static void main(String[] args) throws Exception{
		System.out.println("Start");
		Cola cola = new Cola();
		try{
			cola.drinken();
		}catch(Exception e){
			System.out.println("hij is gevangen");
		}catch(RuntimeException re){
			System.out.println("nogmaals");
		}
		System.out.println("Einde");
	}
}
class Cola{
	void drinken() throws Exception{
		throw new Error();
	}
}



