
public class insertion_sort {
	public static void insertionsort(int[] array){
		for(int i=1;i<array.length;i++){
			int j=i-1;
			int currentNumber=array[i];
			while(j>=0&&array[j]>array[i]){
				array[j+1]=array[j];
				j--;
			}
			array[j + 1] = currentNumber;
		}
	}
}
