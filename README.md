# Data types
- There are two types of Data types in Java, Primitive and Non-primitive.
- primitive data types include: char, bol, int, float etc.
- Non-Primitive include: class, interface and Array.
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

## What is "~" used for?

# Operators
- Unanry
- Logical 
- Shift
- Ternary operator
## Unary Operator
- use of ++ and --.
```java
    int a = 10;
    System.out.prinln(a++); //11
    System.out.println(++a); //12
    System.out.println(a--); //11
    System.out.println(--a); //10
```
      


## Logical Operator
- use of && and || Or operators.
``` java
	int a = 10;
	int b = 20
	if (a & b >= 10) {
		System.out.println("They are greater than 10");

	}elseif(a || b = 10){
		System.out.println("One of them is equal to 10");

	}

```


## Shift Operator
- use of << and >> operator.
- unable to understand bit shift operator
- The only understandable thing was / divsion by 2 when bit is shifted to right and multiplication by 2 when shifted to left.

## Ternary Operator
- It is inline usage of if else statement.
```java
int a = 10;
int a = 5;
// return minimum number

int min = (a<b)?a:b;
System.out.println(min);

```
## Conditional Statements
 The conditional statement includes if else, switch and loops.
most commonly used loop is for loop
```java
public class conditional{

public static void main(String[] args){
	
	// if-else statement
	// calculate leap year it is divisible by 400 and 4 but not by 100 
	int year = 2023;
	if(((year%4 == 0)&&(year%100 != 0))||(year%100 == 0)){
		System.out.println("Leap Year");
	}else{
	
		System.out.println("not a Leap Year");
	}

// switch statement


	String level = "Expert";
	int lvl = 0;

	switch(level){
		case "beginner": lvl =1;
		break;
		case "intermediate": lvl = 2;
		break;
		case "Expert": lvl = 3;
		break;
		default: lvl = 0;
		break;	
	}

	System.out.println("Your Level is " + lvl);

// for-Loop

for(int i = 1; i<=5;i++){
for(int j = 1; j<=i; j++){
	System.out.print("* ");

}
System.out.println();
} 	





}

}

```
# OOP
it is comprised of:
    1. class
    2. polymorphism 
    3. inheritance
Basics of OOP:
``` java

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
```
The above code uncovers the object and class declaration, also it depicts various ways of object intialisation.


