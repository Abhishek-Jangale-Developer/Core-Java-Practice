package Lambda_Example;

public class Second {

		
		public static void main(String[] args) {
			
			run fun = (i,j)->{                // or==>    run fun = (int i,int j)->{ 
				System.out.println(i+j);
			};
		  fun.fast(12,46);
		}
	}
	interface run
	{
		void fast(int i,int j);
	}