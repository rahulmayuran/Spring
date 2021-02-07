package constructor.injection;

public class BeanClassu {

	private int idnumber;
	private String name;
	
	public BeanClassu(int idnumber, String name) {
		this.idnumber = idnumber;
		this.name = name;
	}
	
	void kaatu()
	{
		System.out.println(idnumber+" - "+name);
	}
	
}
