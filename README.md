# Data types
- There are two types of Data types in Java, Primitive and Non-primitive.

## Variables
- The Number of variables are divided into three types:
    1. Static
    2. local
    3. Instance

### Static Variabales
`Static variables are the variables which are declared once in the program and its instance can be used more than once in the programe.`
### local Variables
`Local variables are declared inside the method and there scope is limited to that method`
### instance
`Instance variables are declared inside the class but outside the body of method`
```java
public class vars {
		
		// static variable
		static int sval = 69; 
		void method(){
			// local variable
			int localVal = 59;
			char localChar = 'L';
			System.out.println(localVal);
			System.out.println(localChar);

			
		}
		
		public static void main(String[] args){
			// instance variable
			int Ival = 23;
			char Iname = 'I';
			double Ifval = 2.3;
			
			vars obj = new vars();
			obj.method();			
			System.out.println(sval);
			System.out.println(Ival);
			System.out.println(Iname);
			System.out.println(Ifval);	
			
		}

}
```
![vars image](https://github.com/waqarNaeem786/JavaBasics/blob/main/shots/vars.png)

# TypeCasting
It is the process of changing the type of variable.
``` Java
public class typecasting{

public static void main(String[] args){
	float nmbr = 10.3f;
	int newnmbr = (int)nmbr;

	System.out.println(nmbr);
	System.out.println(newnmbr);

}

}
```
![Typecasting](https://github.com/waqarNaeem786/JavaBasics/blob/main/shots/taypecasting.png) 
