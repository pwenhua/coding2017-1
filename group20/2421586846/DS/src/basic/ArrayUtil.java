package basic;

public class ArrayUtil {
	public boolean ArrayElementEqual(int [] source){
	 	boolean equal = true;
		for (int i =1 ;i< source.length;i++){
			equal = equal && (source[i-1]== source[i]);
		}
		return equal;
	}
	public int  game(int[] target){
		int sum =0;
		while ( ArrayElementEqual(target) == false){
			sum += AdjustArray(target);
		}
		return sum;
	}
	public int AdjustArray(int[] target){
		int sum =0;
		
		int [] source = new int[target.length]; 
		for (int i=0;i< target.length ;i++){
			source[i]=target[i];
		}
		
		for (int i =1;i< source.length ;i++){ 
			target[i]=source[i]/2 + source[i-1]/2;
			if (target[i]%2==1){
				target[i] ++;
				sum ++;
			}
		}
		
		target[0]=source[0]/2 + source[source.length-1]/2;
		if (target[0]%2==1){
			target[0] ++;
			sum ++;
		}
		for (int i=0;i< target.length ;i++){

			System.out.println(target[i]);
		}

		System.out.println("sum:    " + sum);
		return sum;
	}
	
	public void Reverse(int[] Origin){
		int size = Origin.length;
		int[] target = new int[size];
		for (int i=0 ;i< size ;i ++){
			target[i]=Origin[size-1-i];
		}
		for (int i=0 ;i< size ;i ++){
			Origin[i]=target[i];
		} 
	}
 
	public int[] RemoveZero(int[] Origin){
		int zeroNumber =0;
		for (int i = 0; i<Origin.length;i++ ){
			if (Origin[i]==0 ){
				zeroNumber++;
			}
		}
		int[] target = new int[Origin.length -zeroNumber+1];
		int j =0;
		for (int i =0;i< Origin.length ;i++){
			if (Origin[i]!=0 ){
				target[j++]= Origin[i];
			}
		}
		target[j]=100;
		return target;
	}
	
	//返回小于给定最大值max的所有素数数组
	// 例如max = 23, 返回的数组为[2,3,5,7,11,13,17,19]
	public int[] GetSu(int max){		
		if (max<3){
			int [] target = new int [0];
			return target;
		}
		
		int i =1;
		while (su(i)< max){
			i++;
		}
		int[] target = new int [i-1];
		for (i=0;i< target.length ;i++){
			target[i]= su(i+1);
		}
		return target;
	}
	/*
	 * 用seperator 把数组 array给连接起来
	 * 例如array= [3,8,9], seperator = "-"
	 * 则返回值为"3-8-9"
	 * @param array
	 * @param s
	 * @return
	 */
	public String join(int[] array, String seperator){
		if (array.length ==0){
			return "";
		}
		String str = array[0] + "";
		for (int i =1;i< array.length ;i++){
			str= str + seperator +array[i];
		}
		return str;
	}
	
	public int su(int x){
		if (x==1){
			return 2;
		}
	
		
		int i= su(x-1)+1; 
		int j=2;
		
		boolean zhenchu = false;
		
		while (true){
			zhenchu = false;
			for (j=2;j<(i/2);j++){
				if ((i%j) ==0 ){
					zhenchu = true; 
					break;
				}			 
			} 	
			if (zhenchu){
				i++;
			}
			else {
				return i;
			} 			
		}	
		
	}
	/*
	 * 斐波那契数列为：1，1，2，3，5，8，13，21......  ，给定一个最大值， 返回小于该值的数列
	 * 例如， max = 15 , 则返回的数组应该为 [1，1，2，3，5，8，13]
	 * max = 1, 则返回空数组 []
	 * @param max
	 * @return
	 */
	public int fib(int x){
		if (x<=0){
			return -1;
		}
		if (x==1){
			return 1;
		}
		else if (x==2){
			return 1;
		}
		else {
			return fib(x-1) +fib(x-2);
		}
	}
	
	public int[] fibonacci(int max){
		int i =1;
	 
		if (max <=1 ){
			int[] target = new int [0];
			return target;
		}
		
		while (fib(i)<max){
			i++;
		}
		int[] target = new int [i-1];
		
		for (i=0;i< target.length ;i++){
			target[i]=fib(i+1);
		}
		return target;
	}
	
	
	public int[] grow(int [] oldArray,  int size){
		int[] target =new int[oldArray.length +size];
		System.arraycopy(oldArray, 0, target, 0, oldArray.length);
		
		return target;
	}
	/*
	 * 给定两个已经排序好的整形数组， a1和a2 ,  创建一个新的数组a3, 使得a3 包含a1和a2 的所有元素， 并且仍然是有序的
	 * 例如 a1 = [3, 5, 7,8]   a2 = [4, 5, 6,7]    则 a3 为[3,4,5,6,7,8]    , 注意： 已经消除了重复
	 * @param array1
	 * @param array2
	 * @return
	 */
	public int[] merge(int[] array1, int[] array2){
		for (int i =0;i< array2.length ;i++){
			array1=insert(array1,array2[i]);
		}
		return  array1;
	} 
	
	public int[] insert(int[]origin, int a){
		if (origin.length ==0){
			int[] target = new int[1];
			target[0]= a;
			return target;
		}
		for (int i=0 ;i< origin.length ;i++){
			if (a == origin[i]){
				
				return origin;
			}
		}
		if (a< origin[0]){
			int[] target = new int[origin.length +1];
			System.arraycopy(origin, 0, target, 1, origin.length );
			target[0]=a;
			return target;
			
		}
		else if (a> origin[origin.length-1]){
			int[] target = new int[origin.length +1];
			System.arraycopy(origin, 0, target, 0, origin.length );
			target[ origin.length]=a;
			return target;
		}
		else {
			int[] target = new int[origin.length +1];
			int i =0;
			while (origin[i]<a){
				target[i]=origin[i];
				i++;
			}
			target[i]=a;
			System.arraycopy(origin, i, target, i+1, origin.length-i);
			return target;
			
		}
		
	}
}
