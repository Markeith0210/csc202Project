package project.model;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement()
public class Employee extends User{
	private Set<Task> tasks;
}
