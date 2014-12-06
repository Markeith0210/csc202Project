package project.orm;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;



/*
 * the initial design, I didn't realize this was implemented in vanilla java :P
 * 
 * screw file parsing, I'm going to jax-b annotate my model objects and just marshal and unmarshal them here.
 * 
 * to tie it into the comp sci class, complex xml data types can be generally thought of as a tree.
 */
public class JAXBContainer {

	private JAXBContext context;
	{ 
		try {
			//if this needs to be flattened, I guess a class[] would work
			context= JAXBContext.newInstance("project.model");
		} catch (JAXBException e) {
			System.out.println("something horrible happened");
			e.printStackTrace();
		}
	}
	
}