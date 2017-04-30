import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] a = {3,110,6,4,8,9,5,1,100,3};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void insertionSort(int[] a){
		for(int i=1;i<a.length;i++){
			int j=i;
			int t = a[i];
			while(j>0 && a[j-1]>t){
				a[j]=a[j-1];
				j--;
			}
			a[j]=t;
		}
	}
}
