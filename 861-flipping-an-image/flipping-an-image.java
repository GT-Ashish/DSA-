class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            int start = 0;

            int end = image[i].length - 1;

            while (start <= end) {

                if (image[i][start] == image[i][end]) {
                    if (image[i][start] == 0) {
                        image[i][start] = image[i][end] = 1;
                    } else {
                        image[i][start] = image[i][end] = 0;
                    }

                }
                start++;
                end--;
            }

        }
        return image;
    }
}