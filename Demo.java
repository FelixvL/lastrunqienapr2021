class Demo{  // DR
	public static void main(String[] args){
		System.out.println("Start");
		Start s = new Start();
		s.daarGaanWe();
		System.out.println("Einde");
	}
}
class Start{
	void daarGaanWe(){
		if(true)
			System.out.println("Een");
			System.out.println("Twee");
		return;
	}
}


