class Solution {
    public boolean isValidSudoku(char[][] board) {

        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<Integer, Set<Character>> col = new HashMap<>();
        Map<String, Set<Character>> square = new HashMap<>();

        // Initialize rows and columns
        for (int i = 0; i < 9; i++) {
            row.put(i, new HashSet<>());
            col.put(i, new HashSet<>());
        }

        // Traverse the board
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                // Ignore empty cells
                if (board[r][c] == '.') {
                    continue;
                }

                char num = board[r][c];

                // Identify the 3x3 square
                String box = (r / 3) + "," + (c / 3);

                // Create set for this square if it doesn't exist
                if (!square.containsKey(box)) {
                    square.put(box, new HashSet<>());
                }

                // Check duplicate
                if (row.get(r).contains(num) ||
                    col.get(c).contains(num) ||
                    square.get(box).contains(num)) {

                    return false;
                }

                // Add number to row, column and square
                row.get(r).add(num);
                col.get(c).add(num);
                square.get(box).add(num);
            }
        }

        return true;
    }
}