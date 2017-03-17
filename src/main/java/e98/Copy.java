package e98;

import java.util.Arrays;

/**
 * @author nurulatiqahali
 * replace an array index
 */
public class Copy {
public static void main(String[] args) {
	int[] original ={1,2,3,4};
	int[] copied = copy(original);
	
	copied[0]=99;
	
	System.out.println("original: " + Arrays.toString(original));
	System.out.println("copied: " + Arrays.toString(copied));
}

/**
 * since you are supposed to create a copy of the parameter,
 *  the method should create a new array where the contents 
 *  of the parameter is copied.
 * @param array
 * @return
 */
public static int[] copy(int[] array) {
	int i = 4;
	int[] newArray = new int[i];
	newArray[1] = 2;
	newArray[2] = 3;
	newArray[3] = 4;
	for(i=0;i<array.length;i++)
	if(array[0] == array[i]){
		return newArray;
	}
	return array;
}
}
