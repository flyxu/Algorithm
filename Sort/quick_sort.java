import java.util.Arrays;

/*
 * 快速排序
 * 时间复杂度O(nlogn)
 * 空间复杂度O(1)
 */
public class quick_sort {
	public static int partition(int[] array, int low, int high) {
		if (low < high) {
			return -1;
		}
		int tmp = array[low];// 枢轴记录
		while (low < high) {
			while (low < high && array[high] >= tmp) {
				high--;
			}
			array[low] = array[high];// 交换比枢轴小的记录到左端
			while (low < high && array[low] <= tmp) {
				low++;
			}
			array[high] = array[low];// 交换比枢轴小的记录到右端
		}
		// 扫描完成，枢轴到位
		array[low] = tmp;
		// 返回的是枢轴的位置
		return low;
	}

	public static void quicksort(int[] array, int low, int high) {
		if (low < high) {
			int dp = partition(array, low, high);// 将数组分为两部分
			quicksort(array, low, dp - 1);// 递归排序左子数组
			quicksort(array, dp + 1, high);// 递归排序右子数组
		}
	}

	public static void main(String[] args) {
		int[] A = { 4, 3, 6, 2, 4, 6 };
		quicksort(A, 0, 5);
		System.out.println(Arrays.toString(A));
	}

}
