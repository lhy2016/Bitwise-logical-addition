package cmpe102project;

public class alu 
{
	private boolean a;
	private boolean b;
	private boolean cin;
	private boolean s;
	private boolean cout;
	
	public alu()
	{
		a = false;
		b = false;
		cin = false;
		s = false;
		cout = false;
	}
	
	public boolean getA(){return a;}
	public boolean getB(){return b;}
	public boolean getCin(){return cin;}
	public boolean getS(){return s;}
	public boolean getCout(){return cout;}
	
	public void setA(boolean a){this.a = a;}
	public void setB(boolean b){this.b = b;}
	public void setCin(boolean cin){this.cin = cin;}
	public void setS(boolean s){this.s = s;}
	public void setCout(boolean cout){this.cout = cout;}
	
	public void add()
	{
		s = (!a && !b && cin)||(!a && b && !cin)||(a && !b && !cin)||(a && b && cin); 
		cout =(a && !b && cin)||(a && b && !cin)||(!a && b && cin)||(a && b && cin);
	}

}
