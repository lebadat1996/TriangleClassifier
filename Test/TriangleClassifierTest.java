import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void triangleClassifier1() {
        int a =2,b=2,c=2;
        String expected = "tam giac deu";
        String actual = TriangleClassifier.TriangleClassifier1(a,b,c);
        assertEquals(expected,actual);
    }
    @Test
    void triangleClassifier2() {
        int a =2,b=2,c=3;
        String expected = "tam giac can";
        String actual = TriangleClassifier.TriangleClassifier2(a,b,c);
        assertEquals(expected,actual);
    }
    @Test
    void triangleClassifier3() {
        int a =3,b=4,c=5;
        String expected = "tam giac thuong";
        String actual = TriangleClassifier.TriangleClassifier3(a,b,c);
        assertEquals(expected,actual);
    }
    @Test
    void triangleClassifier4() {
        int a =-1,b=4,c=5;
        String expected = "khong phai tam giac";
        String actual = TriangleClassifier.TriangleClassifier4(a,b,c);
        assertEquals(expected,actual);
    }
}