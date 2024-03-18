import java.io.*;
import java.util.Scanner;

public class First {
	public static void main(String args[]) {
		// object creation for thread classes
		Numeric num = new Numeric();
		Alpha alp = new Alpha();
		Roman ro=new Roman();

		// start the thread
		num.start();
		
			try {
				num.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
		
		alp.start();
		ro.start();
	
	}

}

class Numeric 
extends Thread {
	int a = 10;

	public void run() {

		try {
			for (int i = 0; i <= 100; i++) {
				
				System.out.println("Numeric Thread : " + a);
				a++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

class Alpha extends Thread {
	char a = 'A';

	public void run() {
		try {
			for (int i = 0; i <= 25; i++) {

				System.out.println("Alpha Thread : " + a);
				a++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
class Roman extends Thread {
	char r = 'I';

	public void run() {
		try {
			for (int i = 0; i <= 250; i++) {

				System.out.println("Roman Thread : " + r);
				r++;
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}