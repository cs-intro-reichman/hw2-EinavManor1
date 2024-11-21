public class CalcPi {
	public static void main(String [] args) { 
		int numOfArgs= Integer.parseInt(args[0]); 
		int numOfArgs2= (numOfArgs*4)+1;
		double sum = 0;
		double i = 1;
		double j = 2;
		while ((i+j) <= numOfArgs2) {	
			if(i<j){
				double convertArgs = 1 / (i);
				i = i + 3;
				j++;
				sum = convertArgs + sum;
			}else{
				double convertArgs = 1 / (j);
				j = j + 3;
				i++;
				sum = sum - convertArgs;
				}
			}
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi approximated:  "+ (sum*4));		
	}
}
//done