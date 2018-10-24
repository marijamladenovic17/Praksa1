package rs.enjoy.demo1;

public class ThreadNew extends Thread{

	public static int brojac;
	

	
	@Override
	public void run() {
		while(true){
			System.out.println("cao");
		brojac++;
		System.out.println(brojac);
		HelloControler.pozovi();
		try {
			
			sleep(30000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
