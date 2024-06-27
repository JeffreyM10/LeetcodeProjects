class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //combine
        int length = nums1.length + nums2.length;
        int[] combine = new int[length];
        int m = 0;
        for(int x : nums1){
            combine[m] = x;
            m++;
        }
        for(int y : nums2){
        	combine[m] = y;
        	m++;
        }
        //Arrays sort
        Arrays.sort(combine);
        //median
        int middle = length/2;
        if(length % 2 != 0){
            double mid = Math.floor(middle);
            int com = combine[(int)mid];
            float median = (float) com;
            return median;
        }
        else{
            int i = combine[(int) middle];
        	int j = combine[(int) middle-1];
            int sum = (i+j);
            float median = (float) sum/2;
            return median;
        }
    }
}