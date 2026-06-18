class Solution {
    public double angleClock(int hour, int minutes) {
        double minangle=(double)6*minutes;
        double hourangle=(double)30*(hour%12)+0.5*minutes;
        double d=Math.abs(hourangle-minangle);
        return Math.min(d,360-d);
    }
}