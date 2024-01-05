package homeworks.JavaMethods;

public class Draw {


    public static void main(String[] args) {

        System.out.println("Draw Shape Outline:");
        drawShapeOutline(9,4);

        System.out.println("Draw Shape with Corners:");
        drawShapeCorners(4,10);

    }
    public static void drawShapeOutline(int width, int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawShapeCorners(int height, int width) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if ((i == 1 && j == 1)  || (i == height && j == 1) || (i == 1 && j == width/2)||(i==height && j==width)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }




}
