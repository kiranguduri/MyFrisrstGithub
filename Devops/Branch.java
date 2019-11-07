package bankPackage;

public class Branch {
	int id;
	String name;
	boolean hasAtm;
	public Branch()
	{
		
	}
	public Branch(int id, String name, boolean hasAtm) {
		super();
		this.id = id;
		this.name = name;
		this.hasAtm = hasAtm;
	}
	public boolean isHasAtm() {
		return hasAtm;
	}
	@Override
	public String toString() {
		return "Branch [id=" + id + ", name=" + name + ", hasAtm=" + hasAtm + "]";
	}
	

}
