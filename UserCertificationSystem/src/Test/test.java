package Test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class test {
	public static void main(String[] args) {
		String s = "123456";
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		BCryptPasswordEncoder encoder2 = new BCryptPasswordEncoder(9);
		String hashStr = encoder2.encode(s);
		System.out.println(hashStr);
		System.out.println(encoder.matches(s, hashStr));
	}
}
