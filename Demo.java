class Demo{  //    BZ
	public static void main(String[] args) {
		System.out.println("Start");
		Cola cola = new Cola();
		System.out.println("Einde");
	}
}
class Cola{
	void drinken(){
		throw new Exception();
	}
}



