class Demo{  // EB
	public static void main(String[] args){
		Y y = new U();
		System.out.println("Leuk");
	}
}


class R implements Y{   
}

class U extends R{  
	void ijen(){
		System.out.println("ijen in U");
	}  
}

interface Y{  
	void ijen();       
}