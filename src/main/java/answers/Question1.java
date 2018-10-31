package answers;

public class Question1 {

	public static int bestMergedPortfolio(int[] portfolios) {
		int n = portfolios.length;
		int max = 0;
		for (int i = 0; i < n-1; i++) {
			int xl = portfolios[i];
			for (int j = i; j < n; j++) {
				int value = xl ^ portfolios[j];
				if (value > max) {
					max = value;
					if(max == 65535) return 65535;
				}
			}
		}
		return max;
	}

}
