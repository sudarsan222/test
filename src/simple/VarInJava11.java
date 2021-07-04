package simple;
interface Calculator{
	int operation(int a,int b);
}


public class VarInJava11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator add=(var a, var b)->a+b;
		System.out.println(add.operation(10, 2));
		Calculator sub=(var a, var b)->a-b;
		System.out.println(sub.operation(12, 2));
		Calculator mul=(var a, var b)->a*b;
		System.out.println(mul.operation(12, 2));
		System.out.println("Upper".substring(2));
		
	}

}


