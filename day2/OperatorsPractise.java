package week1.day2;

public class OperatorsPractise {

	public static void main(String[] args) {
		
		//Assignment operator
		int a = 2;
		//complex assign operator
		a=a+5;
		System.out.println(a); // a=7
		a+=7;
		System.out.println(a); // a=14
		
		System.out.println("--------------------");
		
		//Arithmetic operator
		int x=7;
		int y=5;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println("------------");
		
		//Comparison operator
		int p=35;
		int q=30;
		int r=45;
		System.out.println(p==q);
		System.out.println(p!=q);
		System.out.println(p>q);
		System.out.println(p<q);
		System.out.println(p>=q);
		System.out.println(p<=q);
		System.out.println("-------------");
		//Logical operator
		//And operator && (Both condition should satisfy)
		//Or operator || (Atleast any one condition should satisfy)
		System.out.println(p==q&&p>q);
		System.out.println(p==q||p>q);
		System.out.println(p>q||p>=q);
		System.out.println(q<p&&q!=p);
		System.out.println(p>=q&&p>r);
		System.out.println("----------");
		//Increment operator
		//preincrement--->k=12; ++k->(value of k will increase and print first time itself)
		//postincrement--> k++ (when u print k frst time(k++) k value will remain same & value of k will increase when u try to print k for the second time)
		int k=12;
		System.out.println(++k); //k=13  //preincrement
		System.out.println(k++); //k=13  //postinc(when u print again it will increase)
		System.out.println(k);   //k=14
		System.out.println(k++); //k=14
		System.out.println(k++); //k=15
		System.out.println(k);   //k=16
		System.out.println(++k); //k=17
		System.out.println("-------------");
		//Decrement operator
		int z=5;
		System.out.println(--z);   //4
		System.out.println(z);     //4
		System.out.println(z--);   //4
		System.out.println(z);     //3
		System.out.println(z--);   //3
		System.out.println(z--);   //2
		System.out.println(z);     //1
		System.out.println(z);     //1
		System.out.println(--z);   //0
	
		

	}

}
