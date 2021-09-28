import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    @DisplayName("test triangle 1")
    void testTriangle0() {
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 2;
        String expected = "equilateral triangle";
        String result = TriangleClassifier.testTriangle(edge1,edge2,edge3);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test triangle 2")
    void testTriangle2() {
        int edge1 = 2;
        int edge2 = 2;
        int edge3 = 3;
        String expected = "isosceles triangle";
        String result = TriangleClassifier.testTriangle(edge1,edge2,edge3);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test triangle 3")
    void testTriangle3() {
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        String expected = "triangular";
        String result = TriangleClassifier.testTriangle(edge1,edge2,edge3);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test triangle 4")
    void testTriangle4() {
        int edge1 = 8;
        int edge2 = 2;
        int edge3 = 3;
        String expected = "non-triangle";
        String result = TriangleClassifier.testTriangle(edge1,edge2,edge3);
        assertEquals(expected,result);
    }
}