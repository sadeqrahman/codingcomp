package answers;

public class Question4 {

	public static int selectionFailedTradedesks(String[][] rows, int numberMachines) {
		
		int sys = rows.length;
		int pcs = rows[0].length;
		
		if(sys < 0 || sys > 100) return 0;
		if(pcs < 0 || pcs > 100) return 0;
		if(pcs < numberMachines) return 0;
		
		numberMachines--;

		
		int min = Integer.MAX_VALUE;
		int start = 0;
		int end = 0;
		int sum = 0;
		
		for(int i=0; i < sys; i++) {
			
			start = 0;
			end = 0;
			sum = 0;
			
			for(int j=0; j<pcs; j++) {
				
				String pc = rows[i][j];
				
				if(pc.length() == 1 && pc.equals("X")) {
					sum = 0;
					start = i + 1;
					end = i + 1;
				}else {
					sum += Integer.parseInt(rows[i][end]);
					
					if((end - start) == numberMachines){
						
						if(sum < min) {
							min = sum;
							sum -= Integer.parseInt(rows[i][start]);
							start++;
						}
					
					}
					end++;
				}
				
			}
			
		}
		
		return min;
	}

}
