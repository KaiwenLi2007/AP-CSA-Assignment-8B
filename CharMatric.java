class CharMatrix {
    private char[][] matrix;

    public CharMatrix(int rows, int cols) {
        matrix = new char[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ' ';
            }
        }
    }

    public CharMatrix(int rows, int cols, char fill) {
        matrix = new char[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = fill;
            }
        }
    }

    public void display() {
        for (char[] row : matrix) {
            for (char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public int numRows() {
        return matrix.length;
    }

    public int numCols() {
        return matrix[0].length;
    }

    public char charAt(int row, int col) {
        return matrix[row][col];
    }

    public void setCharAt(int row, int col, char ch) {
        matrix[row][col] = ch;
    }

    public boolean isEmpty(int row, int col) {
        return matrix[row][col] == ' ';
    }

    public void fillRect(int row0, int col0, int row1, int col1, char fill) {
        for (int i = row0; i <= row1; i++) {
            for (int j = col0; j <= col1; j++) {
                matrix[i][j] = fill;
            }
        }
    }
    public void clearRect(int row0, int col0, int row1, int col1) {
        fillRect(row0, col0, row1, col1, ' ');
    }
    public int countInRow(int row) {
        int count = 0;
        for (int j = 0; j < matrix[row].length; j++) {
            if (matrix[row][j] != ' ') {
                count++;
            }
        }
        return count;
    }

    public int countInCol(int col) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] != ' ') {
                count++;
            }
        }
        return count;
    }


}