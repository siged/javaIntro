package solutions;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
           List<Integer> resultSet = new ArrayList<>();
        for (int i = 0; i < matrix[0].length ; i++) {
            resultSet.add(matrix[0][i]);
        }
        for (int i = 1; i <= 2 ; i++) {
            resultSet.add(matrix[i][matrix[i].length - 1]);
        }
        for (int i = matrix[2].length -2 ; i >= 0; i--) {
            resultSet.add(matrix[2][i]);
        }
        for (int i = 0; i < matrix[1].length - 2; i++) {
            resultSet.add(matrix[1][i]);
        }
        return resultSet;
    }
}
