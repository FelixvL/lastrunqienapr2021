class Demo{  //    BM
	public static void main(String[] args)throws Exception{
		System.out.println("Start");
		Cola cola = new ColaZero();
		try{
			int a = 5;
			cola.drinken();
		}finally{
			a = 6;
			System.out.println("bijna weekend");
		}
		System.out.println("Einde" + a);
	}
}
class Cola{
	void drinken() throws Exception{
		try{
			throw new Exception();
		}catch(Error e){
			System.out.println("ok");
		}
	}
}
class ColaZero extends Cola{
	void drinken(int a){
		System.out.println("0 calorien");
	}
}



