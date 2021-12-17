

public class MyStars {
    
    public static int careful (int x) {
    int y = 1 + x / 2;
    return y;
}

public static void loopStars(int n) {
    int iMax = careful(n);
    int jMax = 2;
    for (int i = 1; i <= iMax; i++) {
        for (int j = 1; j <= jMax; j++) {
        System.out.println("*");
    }
}
}
}