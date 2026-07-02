public class High_Alt {
    public static  int largestAltitude(int[] gain) {
        int high =0;
        int alt=0;
        for(int i=0;i<gain.length;i++){
            alt=alt+gain[i];
            high=Math.max(alt,high);


        }
        return high;
    }

    static void main(String[] args) {
        int []gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
