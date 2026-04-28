package lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lv1_176963 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result =
                sol.solution(
                new String[]{"may", "kein", "kain", "radi"},
                new int[]{5, 10, 1, 3},
                new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}}
        );
        System.out.println(Arrays.toString(result));
    }
}
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        //name의 한 명씩 yearning의 한 명씩 순서대로 mapping
        //photo의 한 행씩 검사 -> sum에 저장하고, sum값 answer에 추가 -> sum 0으로 초기화
        int[] answer = new int[photo.length];

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < name.length ; i++){
            map.put(name[i], yearning[i]);
        }

        for(int i = 0 ; i < photo.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < photo[i].length ; j++){
                //photo[i][j]라는 key와 매칭되는 value를 가져와서 sum에 +=
                String namae = photo[i][j];
                if(map.containsKey(namae)){
                    sum += map.get(namae);
                }
            }
            answer[i] = sum;
        }


        return answer;
    }
}