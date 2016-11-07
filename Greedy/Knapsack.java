import java.util.Scanner;

public class Knapsack {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		while (m-- > 0) {
			int n = in.nextInt();
			int[] w = new int[n];
			int[] v = new int[n];
			for (int i = 0; i < n; i++) {
				w[i] = in.nextInt();
			}
			for (int i = 0; i < n; i++) {
				v[i] = in.nextInt();
			}
			int c = in.nextInt();
			// 按单位重量价值进行排序
			double[] r = new double[n];
			int[] index = new int[n];
			for (int i = 0; i < n; i++) {
				r[i] = (double) w[i] / v[i];
				index[i] = i;
			}
			for (int i = 0; i < r.length - 1; i++) {
				for (int j = i + 1; j < r.length; j++) {
					if (r[j] > r[i]) {
						double tmp = r[i];
						r[i] = r[j];
						r[j] = tmp;
						int tmp_index = index[i];
						index[i] = index[j];
						index[j] = tmp_index;
					}
				}
			}
			int[] w1 = new int[n];
			int[] v1 = new int[n];
			for (int i = 0; i < n; i++) {
				w1[i] = w[index[i]];
				v1[i] = v[index[i]];
			}
			int[] x = new int[n];
			for (int i = 0; i < n; i++) {
				if (w1[i] < c) {
					x[i] = 1;
					c = c - w[i];
				}
			}
			int maxvalue = 0;
			for (int i = 0; i < n; i++) {
				if (x[i] == 1) {
					maxvalue += v1[i];
				}
			}
			System.out.println(maxvalue);

		}
	}
}
