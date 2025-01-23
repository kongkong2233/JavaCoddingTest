class Solution {
    public int[][] solution(int[][] arr) {        
        int row = arr.length;
        int col = arr[0].length;
        
        if (row > col) {
            int[][] newArr = new int[row][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    newArr[i][j] = arr[i][j];
                }
            }
            return newArr;
        } else if (row < col) {
            int[][] newArr = new int[col][col];
            for (int i = 0; i < col; i++) {
                for (int j = 0; j < row; j++) {
                    newArr[j][i] = arr[j][i];
                }
            }
            return newArr;
        } else {
            return arr;
        }
    }
}