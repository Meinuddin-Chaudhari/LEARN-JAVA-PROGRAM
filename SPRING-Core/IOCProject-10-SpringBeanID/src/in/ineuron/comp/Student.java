package in.ineuron.comp;

public class Student {

	private Integer sid;
	private String sname;
	private Integer sage;
	private String saddress;

	
	
	public Student() {
	}
	
	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setSage(Integer sage) {
		this.sage = sage;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}

}
