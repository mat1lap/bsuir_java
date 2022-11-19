package JD_010.src.homework10;

public class Vector {
    private double xLength;
    private double yLength;
    private double zLength;
    private final String VECTOR_INFO;

    public Vector(double xLength, double yLength, double zLength) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        if (zLength != 0) {
            VECTOR_INFO = "This is a vector for a 3D coordinate system";
        } else {
            VECTOR_INFO = "This is a vector for a 2D coordinate system";
        }
    }

    public Vector(double xLength, double yLength) {
        this.xLength = xLength;
        this.yLength = yLength;
        zLength = 0;
        VECTOR_INFO = "This is a vector for a 2D coordinate system";
    }

    public double getXLength() {
        return xLength;
    }

    public double getYLength() {
        return yLength;
    }

    public double getZLength() {
        return zLength;
    }

    public void setXLength(double xLength) {
        this.xLength = xLength;
    }

    public void setYLength(double yLength) {
        this.yLength = yLength;
    }

    public void setZLength(double zLength) {
        this.zLength = zLength;
    }

    public void displayVectorInformation() {
        System.out.printf("%s%f%n%s%f%n%s%f%n%s%f%n%s%n", "Vector length: ", getLengthOfVector(), "X coordinates length:",
                xLength, "Y coordinates length:", yLength, "Z coordinates length:", zLength, VECTOR_INFO);
    }

    public double getLengthOfVector() {
        return Math.floor(Math.sqrt(Math.pow(xLength, 2) + Math.pow(yLength, 2) + Math.pow(zLength, 2)));
    }

    public Vector sumOfVectors(Vector vector1, Vector vector2) {
        return new Vector((vector1.getXLength() + vector2.getXLength()), (vector1.getYLength() + vector2.getYLength()),
                (vector1.getZLength() + vector2.getZLength()));
    }

    public Vector differenceOfVectors(Vector vector1, Vector vector2) {
        return new Vector(Math.abs(vector1.getXLength() - vector2.getXLength()), Math.abs(vector1.getYLength() - vector2.getYLength()),
                Math.abs(vector1.getZLength() - vector2.getZLength()));
    }

    public double scalarProductOfVectors(Vector vector1, Vector vector2) {
        Vector vector3 = sumOfVectors(vector1, vector2);
        double cos = Math.floor((Math.pow(vector1.getLengthOfVector(), 2) + Math.pow(vector2.getLengthOfVector(), 2)
                - Math.pow(vector3.getLengthOfVector(), 2)) / 2);
        return Math.floor(vector1.getLengthOfVector() * vector2.getLengthOfVector() * cos);
    }

    public Vector compareVectors(Vector vector1, Vector vector2) {
        if (vector1.getLengthOfVector() > vector2.getLengthOfVector()) {
            return vector1;
        }
        if (vector1.getLengthOfVector() < vector2.getLengthOfVector()) {
            return vector2;
        }

        return new Vector(0, 0, 0);
    }
}
