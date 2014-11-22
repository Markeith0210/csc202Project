package project.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import project.model.User;

public class UserService {
	public void login(String email, String password){
		System.out.println(email+password);
	}
	private String HashPassword(String target){
		try {
            MessageDigest sh = MessageDigest.getInstance("SHA-512");
            sh.update(target.getBytes());
            StringBuffer sb = new StringBuffer();
            for (byte b : sh.digest()){
            	sb.append(Integer.toHexString(0xff & b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
	}
	public void makeUser(User user) {
		
		
	}
}
