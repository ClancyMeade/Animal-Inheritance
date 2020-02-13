
public abstract class Animal
	{
		protected String name; 
		protected String food; 
		
		//abstract methods 
		public abstract void bearYoung(); 
		public abstract void makeNoise(); 
		//concrete method
		public void eat()
		{ 
			System.out.println("The " + name + " is looking forward to eating " + food + ".");
		}
	}
