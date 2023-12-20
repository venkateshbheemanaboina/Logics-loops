class Table1
{
	void table()
		{
			int a,b=8;
			for (a=1;a<=50;a++)
			{
				 System.out.println(b+"*"+a+"="+b*a);
			}
		
		}
}
class Tables
{
	public static void main(String[] args)
	{
		Table1 t=new Table1();
		t.table();
	}
}