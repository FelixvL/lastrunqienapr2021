class Demo{  //    BI
	public static void main(String[] args) throws Exception{
		System.out.println("Start");
		Cola cola = new Cola();
		try{
			cola.drinken();
		}catch(RuntimeException re){
			System.out.println("nogmaals");
		}catch(Exception e){
			System.out.println("hij is gevangen");
		}
		System.out.println("Einde");
	}
}
class Cola{
	void drinken() throws Exception{
		throw new RuntimeException();
	}
}
class ColaZero extends Cola{
	void drinken(){
		System.out.println("0 calorien");
	}
}



