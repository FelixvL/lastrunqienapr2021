class Demo{  // DV
	public static void main(String[] args){
		System.out.println("Start");
		Start s = new Start();
		int getal = s.daarGaanWe();
		System.out.println("Einde" + getal);
	}
}
class Start{
	int daarGaanWe(){
		if(true)
			return 4;
		else
			System.out.println("Drie");
	}
}


