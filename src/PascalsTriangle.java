// 03/12/2022
// https://leetcode.com/problems/pascals-triangle/

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {

        //System.out.println("5" + generate(5));
        System.out.println("6" + generate(6));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> mainList = new ArrayList<>();
        int linha = 0;

        while (linha != numRows) {
            List<Integer> elementList = new ArrayList<>();
            for (int i = 0; i <= linha; i++) {
                int num = 1;
                if (i - 1 < 0 || i == linha) {
                    elementList.add(num);
                } else {
                    num = mainList.get(linha - 1).get(i-1) + mainList.get(linha - 1).get(i);
                    elementList.add(num);
                }
            }
            mainList.add(elementList);
            linha++;
        }
        return mainList;
    }

}
