package rs.enjoy.demo1;

import org.springframework.stereotype.Component;

@Component
public class Counter {
	int brojac;
	
	public int getBrojac() {
		return brojac;
	}
	public void setBrojac(int brojac) {
		this.brojac = brojac;
	}
	
	public void increase() {
		brojac++;
	}
	
	
}
