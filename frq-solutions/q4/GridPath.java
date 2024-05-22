import java.util.Arrays;

public class GridPath {
    private int[][] grid;

    public GridPath(int[][] grid) {
        this.grid = grid;
    }

    // PART A (uncomment first)
    public Location getNextLoc(int row, int col) {
        int gridRLen = grid.length;
        int gridCLen = grid[0].length;
        if(row == gridRLen-1) {
            return new Location(row, col + 1);
        }
        else if(col == gridCLen - 1) {
            return new Location(row + 1, col);
        }else {
            if(grid[row + 1][col] < grid[row][col + 1]) {
                return new Location(row + 1, col);
            }
            else {
                return new Location(row, col + 1);
            }
        }
    }

    
    // PART B
    public int sumPath(int row, int col) {
        int sum = 0;
        while(row < grid.length - 1 || col < grid[0].length -1){
            sum += grid[row][col];
            Location temp = getNextLoc(row, col);
            row = temp.getRow();
            col = temp.getCol();
            System.out.println(temp);
        }
        return sum += grid[grid.length - 1][grid[0].length - 1];
    }

    // added to see the array on screen 
    public String toString() {
        return Arrays.deepToString(grid);
    }
    
}
