public class Trycatch{
	public static void main(String[] args){
		try{

		int Data=600/0;
	}catch(ArithmeticException e){
		System.out.println(e);												
		System.out.println("rest of the code");
	}
	}
}