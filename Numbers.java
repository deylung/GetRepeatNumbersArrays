import java.util.Arrays;
/*
*
* Author: Sergey Mikhaylov
* Telegram: @deylung
*
 */
public class Numbers {
    public static String getNumbers(int[] arr) {
        StringBuilder string = new StringBuilder();
        int sum = 0;
        int num = 0;
        Arrays.sort(arr);
        for (int k = 0; k < arr.length; k++) {
            if (num != arr[k]) {
                for (int j = k; j < arr.length; j++) {
                    if (arr[k] == arr[j]) {
                        sum += 1;
                    } else {
                        break;
                    }
                }
                if (sum - 1 != 0) {
                    num = arr[k];
                    string.append(num).append(" количество повторений ").append(sum - 1).append("\n");
                }
            }
            sum = 0;
        }
        return String.valueOf(string);
    }
}
