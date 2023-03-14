package blind75.arrays;

import java.util.Arrays;

public class FloodFill {

  public static void main(String[] args) {
    int[][] image = new int[][]{{0, 0, 0, 0}, {0, 0, 0, 0}};
    int[][] painted = floodFill(image, 1, 0, 1);
    System.out.println(Arrays.toString(painted[0]));
    System.out.println(Arrays.toString(painted[1]));

    System.out.println("---------------------------");

    int[][] imageTwo = new int[][]{{1, 1, 1, 1, 1}, {1, 0, 0, 1, 0}, {0, 1, 0, 1, 0}, {1, 1, 0, 1, 1}, {1, 0, 1, 1, 1}};
    int[][] paintedTwo = floodFill(imageTwo, 3, 3, 5);
    System.out.println(Arrays.toString(paintedTwo[0]));
    System.out.println(Arrays.toString(paintedTwo[1]));
    System.out.println(Arrays.toString(paintedTwo[2]));
    System.out.println(Arrays.toString(paintedTwo[3]));
    System.out.println(Arrays.toString(paintedTwo[4]));

    System.out.println("---------------------------");

    int[][] testOne = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
    int[][] testOneFinal = floodFill(testOne, 1, 1, 2);
    System.out.println(Arrays.toString(testOneFinal[0]));
    System.out.println(Arrays.toString(testOneFinal[1]));
    System.out.println(Arrays.toString(testOneFinal[2]));

    System.out.println("---------------------------");

    int[][] testTwo = new int[][]{{0, 0, 0}, {0, 0, 0}};
    int[][] testTwoFinal = floodFill(testTwo, 0, 0, 0);
    System.out.println(Arrays.toString(testTwoFinal[0]));
    System.out.println(Arrays.toString(testTwoFinal[1]));
  }

  public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
    int originalColor = image[sr][sc];

    return fillConnections(image, sr, sc, originalColor, color);
  }

  private static int[][] fillConnections(int[][] image, int sr, int sc, int originalColor, int color) {

    if ((sr >= 0 && sr < image.length) && (sc >= 0 && sc < image[0].length)) {
      if (image[sr][sc] == originalColor && originalColor != color) {
        image[sr][sc] = color;
        image = fillConnections(image, sr - 1, sc, originalColor, color);
        image = fillConnections(image, sr + 1, sc, originalColor, color);
        image = fillConnections(image, sr, sc - 1, originalColor, color);
        image = fillConnections(image, sr, sc + 1, originalColor, color);
      }
    }
    return image;
  }

}