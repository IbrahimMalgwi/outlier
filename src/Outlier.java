import java.util.Arrays;

public class Outlier {

    public static void main(String[] args) {
    }

    public int[] returnedArray(int [] arr) {
        int oddTotal = 0;
        int evenTotal = 0;
        int count = 0;
        int [] result = new int[arr.length - 1];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] % 2 == 0)evenTotal +=1;
            else oddTotal+=1;
        }
        if (oddTotal > evenTotal){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0)result[count++] = arr[i];
            }
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] %2 == 0)result[count++] = arr[i];
            }
        }
        return result;
    }
    public int[] returnedArr(int []arr){
        int [] result;
        int evenTotal = (int) Arrays.stream(arr).filter(n -> n % 2 == 0).count();
        int oddTotal = (int) Arrays.stream(arr).filter(n -> n % 2 != 0).count();
        if (evenTotal > oddTotal)result = Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
        else result = Arrays.stream(arr).filter( n -> n % 2 != 0).toArray();
        return result;
    }
}