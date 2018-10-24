package rs.enjoy.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	@Autowired
	Counter counter;
	static int br = 0;
	
	
	@RequestMapping("/home")
	public String home() {
		
		return "Hello people!";
	}
	@RequestMapping("/counter")
	public String counter() {
		counter.increase();
		return " "+counter.getBrojac();
	}
	@RequestMapping("/pozovi")
	public static String  pozovi() {
		if(br==0) {
		ThreadNew tn = new ThreadNew();
		tn.start();
		br++;
		}
		return "Broj: "+ThreadNew.brojac;
		 
		
	}
	
	
}
