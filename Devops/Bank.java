package bankPackage;

import java.util.List;

public class Bank {

	int id;
	String bankName;
	List<Branch> branchs;
	public Bank(int id, String bankName, List<Branch> branchs) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.branchs = branchs;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", bankName=" + bankName + ", branchs=" + branchs + "]";
	}
	
}
