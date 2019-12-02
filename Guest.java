package pbg;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Guest {
	int id=1;
	String name,add,email,ptype,pid,cont;
	
	String ch;
	void reg(String name,String add,String email,String ptype,String pid,String cont) throws IOException
	{
		this.name=name;
		this.add=add;
		this.cont=cont;
		this.email=email;
		this.ptype=ptype;
		this.pid=pid;
	BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Registration\n\n");
    System.out.println("Enter your name");
    name=in.readLine();
    System.out.println("Enter your address");
    add=in.readLine();
    System.out.println("Enter your contact number");
    cont=in.readLine();
    System.out.println("Enter your email");
    email=in.readLine();
    System.out.println("Enter your proof type");
    ptype=in.readLine();
    System.out.println("Enter your proof id");
    pid=in.readLine();
    System.out.println("\nThank you for registering.Your id is"+id+"..");
    id++;
    System.out.println("Do you want to continue(y/n)");
    ch=in.readLine();
    if(ch.equals("y"))
    {
    	System.out.println("Do you want to update your email id(y/n)");
    	ch=in.readLine();
    	if(ch.equals("y"))
    	{
    		Guest1 s=new Guest1();
    		email=s.change();
    		
    	}
    	
    }
    System.out.println("Your details are as follows");
    System.out.println("Name: "+name);
    System.out.println("Address: "+add);
    System.out.println("Contact Number: "+cont);
    System.out.println("Email ID: "+email);
    System.out.println("Proof type: "+ptype);
    System.out.println(" Proof ID: "+pid);
    
}   
	public static void main(String args[]) throws IOException
	{
		Guest b=new Guest();
		String name="null";
		String add="null";
		String email="null";
		String ptype="null";
		String pid="null";
		String cont="null";
		b.reg(name, add, email, ptype, pid, cont);
	}
}