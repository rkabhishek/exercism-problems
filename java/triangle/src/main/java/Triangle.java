class Triangle {

    private final double side1, side2, side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {

        double[] sides = new double[] {side1, side2, side3};
        
        if (isAnySideZeroLength(sides) || isNoTriangle(sides)) {
            throw new TriangleException();
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    boolean isEquilateral() {
        return side1 == side2 && side2 == side3;
    }

    boolean isIsosceles() {
        return isEquilateral() || side1 == side2 || side2 == side3 || side3 == side1;
    }

    boolean isScalene() {
        return !isEquilateral() && !isIsosceles();
    }

    private static boolean isAnySideZeroLength(double[] sides) {
        return sides[0] <= 0 || sides[1] <= 0 || sides[2] <= 0;
    }

    private static boolean isNoTriangle(double[] sides) {
        return sides[0] + sides[1] < sides[2] || sides[1] + sides[2] < sides[0] || sides[2] + sides[0] < sides[1];
    }
}
