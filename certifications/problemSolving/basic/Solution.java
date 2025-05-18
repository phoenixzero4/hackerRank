package certifications.problemSolving.basic;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;



class Result {

    /*
     * Complete the 'getMaxValue' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int getMaxValue(List<Integer> arr) {

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = 4;
        int[] array = new int[n];
        
        array[0] = 1;
        array[1] = 3;
        array[2] = 2;
        array[3] = 2;
        
       Arrays.sort(array);
       
       for(int i = 0; i < n; i++) {
       		System.out.println(array[i]);
       		
       }
        
    //    int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

   //     List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine().replaceAll("\\s+$", "");
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//            .map(String::trim)
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        int result = Result.getMaxValue(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
        
 //       System.out.println(n);
  //      System.out.println(array);
        
   
        		
        		
        		
        		
        
    }
}
