package project.service;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;




import project.Constants;
import project.model.User;
import project.orm.JAXBContainer;

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
		JAXBContainer jaxb = new JAXBContainer();
		try {
		
			if(!Constants.USER_DIR_FILE.exists()){
				Constants.USER_DIR_FILE.mkdirs();
			}
			File file = Constants.USER_DIR_FILE.toPath().resolve(user.getEmail()+"user.xml").toFile() ;
			jaxb.getMarshaller().marshal(user, file);
			
			
		} catch (JAXBException e) {
			System.out.println("adding user failed");
			e.printStackTrace();
		}
		
	}
}
