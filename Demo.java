class Demo{  // EF
	public static void main(String[] args){
		Y y = new U();
		S t = (S)y;
		System.out.println("Leuk");
	}
}


class R implements Y{ 
	public void ijen(){
		System.out.println("ijen in R");
	}  
}

class U extends R{  
	public void ijen(){
		System.out.println("ijen in U");
	}  
}

interface Y{     
	void ijen();
}

interface S{

}