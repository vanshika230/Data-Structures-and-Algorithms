class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(getDays(date1) - getDays(date2));
    }

    private static int getDays(String s){
        int y = Integer.parseInt(s.substring(0, 4));
        int m = Integer.parseInt(s.substring(5, 7));
        int d = Integer.parseInt(s.substring(8, 10));
        int[] prefix = new int[]{0, 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 2; i <= 13; i++) prefix[i] += prefix[i - 1];
        int ans = (y - 1971) * 365 + prefix[m] + d;
        for (int i = 1972; i < y; i+=4)
            if (isLeap(i))
                ans++;
        if (isLeap(y) && m > 2) ans++; //don't include this within the for loop because m > 2 for it to count.

        return ans;
    }

    private static boolean isLeap(int y){
        return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
    }

}
