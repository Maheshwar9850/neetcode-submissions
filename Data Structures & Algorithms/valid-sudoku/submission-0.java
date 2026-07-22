class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for (int i = 0; i < 9; i++) {
            HashSet<Character> set = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;

                if (set.contains(board[i][j])) {
                    return false;
                }

                set.add(board[i][j]);
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            HashSet<Character> set = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                if (board[i][j] == '.') continue;

                if (set.contains(board[i][j])) {
                    return false;
                }

                set.add(board[i][j]);
            }
        }

        // Check 3x3 boxes
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        char ch = board[row + i][col + j];

                        if (ch == '.') continue;

                        if (set.contains(ch)) {
                            return false;
                        }

                        set.add(ch);
                    }
                }
            }
        }

        return true;
    }
}