package datastructures.easy;

import java.util.List;

public class Methods {

		public static int[] createArray(List<Integer> list, int n) {
				
				int[] array = new int[n];
				
				for(int i = 0; i < list.size(); i++) {
						array[i] = list.get(i);
				}

for(int i = 0; i < array.length; i++) {
		System.out.println("array[" + i +"] = " + array[i]);
		
}
return array;
		}
	
		
}
