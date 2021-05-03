class Demo{  // DX
	public static void main(String[] args){
		System.out.println("Start");
		Start s = new Start();
		int getal = (int)s.daarGaanWe("7");
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
	void daarGaanWe(String r){
		System.out.println("Vier");
		return "5";
	}
}


