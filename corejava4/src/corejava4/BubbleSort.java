package corejava4;
import java.util.Arrays;

public class BubbleSort {
	static void bubbleSort(int array[]) {
		int size = array.length;
		//loop to access each array element
		for(int i=0; i< size-1;i++)
			for(int j =0;j < size-i-1; j++)
				if(array[j] > array[j+1]) {
					int temp =array[j];
					array[j] =array[j+1];
					array[j+1]=temp;
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { -12,53,0,88,-9};
		BubbleSort.bubbleSort(data);
		System.out.println("Sorted Array in Ascending Order:");
		System.out.println(Arrays.toString(data));

	}

}
