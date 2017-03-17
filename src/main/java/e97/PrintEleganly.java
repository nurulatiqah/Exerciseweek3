package e97;

public class PrintEleganly {
	public static void main(String[] args) {
		int[] array = {5,1,3,4,2};
		printElegantly(array);
	}
	
	/**
	 * @param array
	 * print number with , except for the last index
	 */
	public static void printElegantly(int[] array){
		int i;
		for(i=0;i<array.length;i++){
			
		if(i==0 || i<=array.length-2){
		
			System.out.print(array[i]+ ", ");
		}else
			System.out.print(array[i]);
		}
	}
}
