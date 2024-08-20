class Phone {
	void call() {
		System.out.println("Calling feature available");
	}
	void sms() {
		System.out.println("SMS feature available");
	} 
}

interface Camera {
	void click();
	void gallery();
}

interface GameConsole {
	void play();
	void download();
}

class SmartPhone extends Phone implements Camera,GameConsole {
	public void click() {
		System.out.println("Clicking pics feature available");
	}

	public void gallery() {
		System.out.println("Gallery storage available");
	}

	public void play() {
		System.out.println("Gaming feature available");
	}
	
	public void download() {
		System.out.println("Downloading games feature available");
	}	
}

class qs2_3 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.sms();
		sp.play();
		sp.gallery();
	}
}	