public class TriangleClassifier {
    public static String TriangleClassifier1(int a, int b, int c) {
        if (a == b && a == c) {
            return "tam giac deu";
        }
        return TriangleClassifier1(a, b, c);
    }

    public static String TriangleClassifier2(int a, int b, int c) {
        if (a == b && a != c) {
            return "tam giac can";
        }
        return TriangleClassifier2(a, b, c);
    }

    public static String TriangleClassifier3(int a, int b, int c) {
        if (a != b && a != c && c != b) {
            return "tam giac thuong";
        }
        return TriangleClassifier3(a, b, c);
    }

    public static String TriangleClassifier4(int a, int b, int c) {
        if (a > (b + c)) {
            return "khong phai tam giac";
        }
        if (a <= 0)
            return "khong phai tam giac";
        return TriangleClassifier4(a, b, c);
    }
}
