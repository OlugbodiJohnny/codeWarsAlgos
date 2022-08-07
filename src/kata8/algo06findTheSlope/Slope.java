package kata8.algo06findTheSlope;

public class Slope {
    public String slope(int[] points) {
        if (points[2] - points[0] == 0) return  "undefined";
        return String.valueOf((points[3] - points[1]) / (points[2] - points[0]));
    }
}
