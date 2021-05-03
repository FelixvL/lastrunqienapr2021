class Demo{  // ED
	public static void main(String[] args){
		Y y = new U();
		R r = y;
		r.ijen();
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