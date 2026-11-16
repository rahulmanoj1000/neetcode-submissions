class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] op = new int[temperatures.length];

        for(int i=0;i < temperatures.length; i++) {
            int counter = 0;
            for(int j=i; j < temperatures.length; j++) {
                if(temperatures[i] < temperatures[j]) {
                    op[i] = counter;
                    break;
                } if(j+1 == temperatures.length){
                    op[i] = 0;
                    break;
                }
                counter++;
            }
        }
        return op;
    }
}
