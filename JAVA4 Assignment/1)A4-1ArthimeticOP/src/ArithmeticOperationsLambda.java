

interface Add{
	int add(int x,int y, int z);
}

interface Subtract{
	int sub(int x,int y);
}

interface Multiply{
	int mul(int x,int y, int z);
}

interface Divide{
	int div(int x,int y);
}



public class ArithmeticOperationsLambda {

	public static void main(String[] args) {
		
		
		Add addFunction = (a,b,c) -> a+b+c;
		System.out.println(addFunction.add(10,20,30));
		
		Subtract subFunction = (a,b) -> a-b;
		System.out.println(subFunction.sub(10,20));
		
		Multiply mulFunction = (a,b,c) -> a*b*c;
		System.out.println(mulFunction.mul(1,2,3));
		
		Divide divFunction = (a,b) -> a/b;
		System.out.println(divFunction.div(10,2));
		

	}

}
