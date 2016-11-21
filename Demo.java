class Demo {

	public static void display() throws ArithmeticException {
		System.out.println("I am joking..");
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		int positiveInteger = 10;

		try{
			System.out.println("Welcome");
			System.out.println(a/b);
			int[] arr = {1, 2};
			System.out.println(arr[0]);
				
			if(positiveInteger > 0) {
				System.out.println("Positive Integer is: " + positiveInteger);
			}
			else{
				throw new Exception("Integer is not positive");	
			}

			System.out.println("I am dependant on above statements");
		}
		catch(ArithmeticException ae) {
			System.out.println("ArithmeticException");
		}
		catch(Exception e) { 
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally");
		}

		System.out.println("Very important code...");

		display();

	}

}