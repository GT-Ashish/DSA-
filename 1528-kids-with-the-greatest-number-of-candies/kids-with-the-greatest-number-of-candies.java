class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int a : candies) {
            if (a > max) {
                max = a;
            }
        }
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);

        }
        return result;

    }
}