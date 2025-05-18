package datastructures.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

		public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

//     List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//         .map(Integer::parseInt)
//         .collect(toList());

    int[] array = new int[n];
    for(int i = 0; i < n; i++){
        array[i] = Integer.parseInt(bufferedReader.readLine());
        System.out.println(array[i]);
    }
    bufferedReader.close();
		}

}
