/*
 * 选择排序
 * 时间复杂度O(n^2),空间复杂度O(1)
 */
public class selection_sort {
	public static void selection_sort(int[] unsort) {
		for (int i = 0; i < unsort.length - 1; i++) {
			int min = unsort[i];
			int min_index = i;
			for (int j = i + 1; j < unsort.length; j++) {
				if (unsort[j] < min) {
					min = unsort[j];
					min_index = j;
				}
			}
			if (min_index != i) {
				int tmp = unsort[i];
				unsort[i] = unsort[min_index];
				unsort[min_index] = tmp;
			}
		}
	}

	public static void main(String[] args) {
		int unsort[] = { 2, 3, 1, 4 };
		selection_sort(unsort);
		for (int i : unsort) {
			System.out.println(i);
		}
	}
}
