package SystemDesign.tictactoe.gameentity;

import java.util.Arrays;

public class Board {
    
    public int grid[][];
    int size;
    public Board(int n){
        
        this.grid=new int[n][n];
        this.size=n;
        for(int i[]:grid)
            Arrays.fill(i,-n);
    }
    
    public int getRowSum(int row){
        
        int sum=0;
        for(int i=0;i<this.size;i++){
            sum+=grid[row][i];
        }
        return sum;
    }

    public int getColSum(int col){

        int sum=0;
        for(int i=0;i<this.size;i++){
            sum+=grid[i][col];
        }
        return sum;
    }
    
    public int getSize(){
        
        return this.size;
    }

    public void print() {
        System.out.println("------------------");
        for(int i=0;i<this.size; i++) {
            for(int j=0; j<this.size; j++) {
                if(this.grid[i][j] == 1) {
                    System.out.print("X ");
                }
                else if(this.grid[i][j] == 0) {
                    System.out.print("O ");
                }
                else
                    System.out.print("- ");
            }
            System.out.println();
        }

    }
}
