package lv1;

public class lv1_136798 {
    public int lv1_136798 (int number, int limit, int power) {
        int sum = 0;
        int[] arr = new int[number + 1];
        for(int i = 1 ; i <= number ; i++){
            for(int j = 1 ; j * j <= i ; j++){
                if(i % j == 0) {
                    if(j * j == i) arr[i]++;
                    else arr[i] += 2;
                }
            }
        }
        for(int num = 1 ; num <= number ; num++){
            if(arr[num] > limit) arr[num] = power;
            sum += arr[num];
        }
        return sum;
    }
}
