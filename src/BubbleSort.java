import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {3,110,6,4,8,9,5,1,100,3};
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void bubbleSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=i;j<a.length;j++){
				if(a[i]>a[j]){
					swap(i,j,a);
				}
			}
			System.out.println(Arrays.toString(a));
		}
	}

	private static void swap(int i, int j, int[] a) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
		
	}
}	
