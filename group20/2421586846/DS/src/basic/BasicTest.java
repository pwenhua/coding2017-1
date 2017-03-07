package basic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverse() {
		ArrayUtil test = new ArrayUtil(); 

		//int [] array1 = test.fibonacci(9);
		int [] array1 = {2,4,6,8,10};
		int i =test.game(array1);
		System.out.println(i); 
		/*
		int sum = test.AdjustArray(array1);
		for (int i =0;i< array1.length;i++){
			System.out.println(array1[i]); 
		}
		System.out.println("sum" + sum);
		
	//	if (test.ArrayElementEqual(array1)){
		//	System.out.println("equal"); 
			
//		}*/
		
	}
	public void testJoin(){
		ArrayUtil test = new ArrayUtil();
		

		//int [] array1 = test.fibonacci(9);
		int [] array1 = {1,23,44,565};
		 
		
		System.out.println(test.join(array1, "-"));
	}
	
	public void testfib(){
		ArrayUtil test = new ArrayUtil();
		

		int [] array1 = test.fibonacci(9);
		
		for (int i =0 ;i< array1.length; i++){
			System.out.println(array1[i]);
		}
		
		//System.out.println(test.fib(7));
	}
	public void testSU(){

		ArrayUtil test = new ArrayUtil();
		

		//int [] array1 = test.fibonacci(9);
		int [] array1 = test.GetSu(200);
		for (int i =0 ;i< array1.length; i++){
			System.out.println(array1[i]);
		}
		
		//System.out.println(test.su(9));
		
	}
	public void testFirst(){
		int[] array1 = {0,1,2,3,6,8,10};
		int[] array2 = {-10,1,2,3,7,9,10};
		
		/*
		origin[0]=0;
		origin[1]=1;
		origin[2]=2;
		origin[3]=3;*/
		ArrayUtil test = new ArrayUtil();
		//test.Reverse(origin); 
		array1 = test.merge(array1, array2);
		//array1 = test.insert(origin,12);
		
		for (int i =0 ;i< array1.length; i++){
			System.out.println(array1[i]);
		}
	}

}
