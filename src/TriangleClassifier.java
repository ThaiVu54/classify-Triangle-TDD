public class TriangleClassifier {
    public static String testTriangle(int side1, int side2, int side3) {
        if (side1 == side2 && side1 == side3 && side2 == side3) {
            return "equilateral triangle";
        }else if(side1 == side2 || side1 == side3 || side2 == side3){
            return "isosceles triangle";
        }else if(side1 != side2 && side1 != side3 && side2 != side3){
            return "triangular";
        }else
        return "non-triangle";
    }
}
