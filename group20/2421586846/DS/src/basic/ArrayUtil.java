package basic;

public class ArrayUtil {
	 
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
