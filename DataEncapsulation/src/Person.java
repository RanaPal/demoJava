
	/**
	 * @author Apal
	 *
	 */
public class Person{
	private String PId="";
	private String name="";
	private String addrs="";
	private  String  phno="";
	private float Salary=160000;;
	private float bonus=0;
	
	
	public void setNameId(String name, int pid) {
		pid++;
		this.name = name;
		//System.out.println("Hi  "+name.substring(0, 1)+"001");
		this.PId=name.substring(0, 1)+"00"+Integer.toString(pid);
//		+Integer.toString(pid);
	}
	public String getPId() {
		return PId;
	}
	public void setPId(String pName, int pid) {
		this.PId =  this.name.substring(0, 1)+"00"+ pid++;
	}

// To make the Class attribute Encapsulated ( Read-only)	use only getter method ,  Should not be any setter method 
// salary only can be viewed  .ie. only get Salary() available  , there is no setSalary()
	public String getName() {
		return this.name;
	}

	public String getAddrs() {
		return this.addrs;
	}

	public String getPhno() {
		return this.phno;
	}

	public float getSalary() {
		return this.Salary;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	private  void setSalary(int salary) {
		if(salary>149999)
			this.Salary = salary;
	}
	
public void setBenefits() {
	setSalary(160000);
	this.bonus=(float) (this.Salary*.04);
}
	
	

	public float getBonus() {
	return bonus;
}

	public void viewPersonInfo( ) {
		System.out.println("Person's Detail Information \n--------------------------");
		System.out.println("Personal Id      :  "+this.PId);
		System.out.println("Name                :  "+this.name);
		System.out.println("Phone                : "+this.phno);	
		System.out.println("Address             : "+this.addrs);
		System.out.println("Annual income : "+this.Salary);
		System.out.println("Bonus                  : "+this.Salary+"\n");
		
	}
	
}
