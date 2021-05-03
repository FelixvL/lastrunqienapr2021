class Demo{  // DZ
	public static void main(String[] args){
		System.out.println("Start");
		Start s = new Start();
		int getal = (int)s.daarGaanWe("7");
		getal.getValue();
		System.out.println("Einde" + getal);
	}
}
class Start{
	int daarGaanWe(){
		if(true)
			return 4;
		else
			System.out.println("Drie");
		return 5;
	}
	Integer daarGaanWe(String r){
		int b = 5;
		System.out.println("Vier");
		return b;
	}
}


