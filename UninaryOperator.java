package Circle;

public class UninaryOperator {
	public static void main(String[] args) {
		int x = -10;
		int result;
		result = +x;
		System.out.println(result);
		//uninar -
		result = -x;
		System.out.println(result);
		
		//Increment
		int z = 10;
		int inc = ++z; // pre in
		System.out.println("Incre: " + inc);
		inc = z++;// post 1
		inc = z++;// post 2
				System.out.println("Post :"+ inc);
		
		int y = 10; 
		int dre = --y; //pre de
		System.out.println("Decre :" + dre);
		dre = y--; // post de 1
		dre = y--; // post de 2
		System.out.println("post :" + dre);
		
		
		
	}
}
