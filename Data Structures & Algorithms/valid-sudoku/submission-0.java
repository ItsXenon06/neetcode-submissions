class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        
        for (int r = 0; r <= 8; r++) {
            for (int c = 0; c <= 8; c++) {
                if (board[r][c] == '.') continue;
                
                int num = board[r][c] - '1'; // maps '1'-'9' to 0-8
                int boxIndex = (r / 3) * 3 + (c / 3);
                
                if (rows[r][num] || cols[c][num] || boxes[boxIndex][num]) {
                    return false;
                }
                
                rows[r][num] = true;
                cols[c][num] = true;
                boxes[boxIndex][num] = true;
            }
        }
        
        return true;
    }
}