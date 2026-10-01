class Emp
{
	private int Eid;
	String Ename;
	public void setEid(int Eid)
	{
		this.Eid=Eid;
	}
	public int getEid()
	{
		return Eid;
	}
	public void setEname(String Ename)
	{
		this.Ename=Ename;
	}
	public String getEname()
	{
		return Ename;
	}
}
class Enps
{
	public static void main(String args[])
	{
		Emp e=new Emp();
 		e.setEid(300);
		e.setEname("shailaja");
		System.out.println(+e.getEid());
		System.out.println(e.getEname());
 	}
}