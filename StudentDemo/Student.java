
public class Student {
	private int id;
	private String name;
	private int m1;
	private int m2;
	private int m3;

	public Student()
	{
		this.id=0;
		this.name=null;
		this.m1=0;
		this.m2=0;
		this.m3=0;

	}

	public Student(int sid,String sname,int sm1,int sm2,int sm3)
	{
		this.id=sid;
		this.name=sname;
		this.m1=sm1;
		this.m2=sm2;
		this.m3=sm3;

	}
	public void setId(int sid)
	{
		this.id=sid;
	}
	public void setname(String sname)
	{
		this.name=sname;
	}
	public void setm1(int sm1)
	{
		this.m1=sm1;
	}
	public void setm2(int sm2)
	{
		this.m2=sm2;
	}
	public void setm3(int sm3)
	{
		this.m3=sm3;
	}

	public int getId()
	{
		return id;
	}

	public  String getname()
	{
		return name;
	}
	public int getm1()
	{
		return m1;
	}
	public int getm2()
	{
		return m2;
	}
	public int getm3()
	{
		return m3;
	}

	public String toString() {
		String str="";
		str+="Student id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 ;
		return str;
	}

}
