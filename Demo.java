class Demo{  //    BK
	public static void main(String[] args){
		System.out.println("Start");
		ColaZero cola = new ColaZero();
		try{
			cola.drinken();
		}finally{
			System.out.println("bijna weekend");
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



