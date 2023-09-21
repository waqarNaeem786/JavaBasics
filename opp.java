// intialisation with reference
class withnew{
	int nmbr;
	String nm;


}

// with getter and setter
class withmethod{
	int val;
	String name;
	void setter(int val, String name){
	this.val = val;
	this.name = name;
	}
	void getter(){System.out.println(val+" "+name);}	
	

}


public class opp{
public static void main(String[] args){

	withnew objn = new withnew();
	objn.nm = "supra";
	objn.nmbr = 25;
	System.out.println(objn.nm);
	System.out.println(objn.nmbr);

	withmethod objm = new withmethod();
	objm.setter(29, "kaboom");
	objm.getter();

}


}
