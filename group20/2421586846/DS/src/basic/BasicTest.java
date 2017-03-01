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
