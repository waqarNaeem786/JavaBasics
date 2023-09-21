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
