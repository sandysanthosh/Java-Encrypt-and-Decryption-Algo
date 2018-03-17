package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;

public class EncryptDecrypt {
	EncryptDecrypt() {
		StringBuffer password = new StringBuffer("Bubbles");
		System.out.println("original: " + password);
		for (int i = 0; i < password.length(); i++) {
			int temp = 0;
			temp = (int) password.charAt(i);
			temp = temp - 9;
			password.setCharAt(i, (char) temp);
		}
		System.out.println("encrypt: " + password);
		for (int i = 0; i < password.length(); i++) {
			int temp = 0;
			temp = (int) password.charAt(i);
			temp = temp + 9;
			password.setCharAt(i, (char) temp);
		}
		System.out.println("Decrypt " + password);
	}
	
	public static void main(String[] args) {
		EncryptDecrypt extendarray = new EncryptDecrypt();
	}

}
