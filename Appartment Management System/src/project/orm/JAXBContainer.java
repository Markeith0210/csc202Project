package project.orm;

import java.io.File;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.omg.CORBA.Context;

import project.model.Task;



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
	public Marshaller getMarshaller() throws JAXBException{

			return context.createMarshaller();
	
	}
	public Unmarshaller getUnMarshaller() throws JAXBException{
		return context.createUnmarshaller();
	}
	/* keeping as example impl of how to use this class
	public static void main(String[] args){
		JAXBContainer jaxb = new JAXBContainer();
		Task task = new Task(new Integer(1),new Integer(2),"",new Date());
		try {
			jaxb.getMarshaller().marshal(task, new File((task.getTaskId()+"task")));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	*/
}