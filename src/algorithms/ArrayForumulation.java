package algorithms;

import java.util.HashMap;

class ArrayFormulation {
    public boolean canFormArray(int[] arr, int[][] pieces) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;
        for(int n : arr) {
            map.put(n, i++);
        }

        for(int[] piece : pieces) {
            int index = -1;
            for(int j : piece) {
                if(map.get(j) == null) return false;
                if(index != -1 && map.get(j) != ++index) return false;
                index = map.get(j);
            }
        }

        return true;

    }
}
