public class FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i <image.length ; i++) {
           int left=0;
           int right=image[i].length;
           while (left<right){
               int temp =image[i][right];
               image[i][right]=image[i][left]^1;
               image[i][left]=temp^1;
               left++;
               right--;
           }
        }
        return image;
    }
}
