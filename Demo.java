class Demo{  // DU
	public static void main(String[] args){
		System.out.println("Start");
		Start s = new Start();
		s.daarGaanWe();
		System.out.println("Einde");
	}
}
class Start{
	int daarGaanWe(){
		if(false)
			System.out.println("Een");
			System.out.println("Twee");
		else
			System.out.println("Drie");
			return 4;
	}
}


