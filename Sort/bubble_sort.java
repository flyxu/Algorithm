import java.util.Arrays;

public class bubble_sort {
	public static void bubblesort(int[] array){
		for(int j=0;j<array.length-1;j++){
		for(int i = 0;i<array.length-1;i++){
			if(array[i+1]<array[i]){
				int tmp=array[i];
				array[i]=array[i+1];
				array[i+1]=tmp;
				}
			}
		}
	}	
	public static void main(String[] args) {
		int[] array={3,4,2,1,5};
		bubblesort(array);
		System.out.println(Arrays.toString(array));
	}
}
