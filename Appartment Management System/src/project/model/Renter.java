package project.model;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
public class Renter extends User{
	
	Set<Lease> leases;

	public Set<Lease> getLeases() {
		return leases;
	}

	public void setLeases(Set<Lease> leases) {
		this.leases = leases;
	}
	
}
