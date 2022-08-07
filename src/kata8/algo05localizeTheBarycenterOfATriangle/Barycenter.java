package kata8.algo05localizeTheBarycenterOfATriangle;

class Barycenter {

    public static double[] barTriang(double[] x, double[] y, double[] z) {
        // your code
        double xCentroidCoordinate = ((x[0] + y[0] + z[0]) / 3);
        xCentroidCoordinate = Math.round(xCentroidCoordinate*Math.pow(10,4))/Math.pow(10,4);
        double yCentroidCoordinate = ((x[1] + y[1] + z[1]) / 3);
        yCentroidCoordinate = Math.round(yCentroidCoordinate*Math.pow(10,4))/Math.pow(10,4);
        return new double[]{xCentroidCoordinate,yCentroidCoordinate};
    }
}
