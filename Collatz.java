

public class Collatz{
	public static void main(String args[]) {
		String org = args[0];
		int lenArg = (org.length());
		String seed1 = (org).substring(0,(lenArg -1));
		int seedN = Integer.parseInt(seed1);
		String mood = args[1];
		int i = 0;
		boolean c = Boolean.getBoolean(mood);
		while (i < seedN){
			i++;
			int count = 1;
			int j = (i);
			String collatz =(i+"");
			while(j >= 1){
				if ((j==1 && (collatz.length() >1))){
					if (mood.equals("v")){
						System.out.println(collatz + "(" + String.valueOf(count) + ")");
						c = true;
						break;
					}else{
						c =true;
						break;
					}
					}
					
				else{
					if (j % 2 == 0 ){
						j = (j/2);	
						count++;
						String addEven =  String.valueOf(j);
						collatz = collatz + " " + addEven;
					}else{ 
						if (((j % 2) != 0) || (j==1 && ((collatz.length()) == 0))){
								j = ((j*3)+1);
								count++;
								String addOdd =  String.valueOf(j);
								collatz = (collatz + " " + addOdd);
						} else {
							c= false;
							System.out.println("we never gonna be friends");
						}
}
					}
				}
			}
		if (c == true){
			System.out.println("Every one of the first " + seed1 + " hailstone sequences reached 1.");
	}
	}
}