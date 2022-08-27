package SystemDesign.snakeandladder.gameentity;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Board {
    
    public final Map<Integer,BoardEntity> map;
    int cellCount;
    Random random;
    public Board(int n){
        this.cellCount=n*n;
        map=new HashMap<>();
        random =new Random();
        assignLadder();
        assignSnake();
        printBoard();
    }
    
    public void assignSnake(){
        int m=(cellCount*10)/100;
        for(int i=0;i<m;i++){
            int start=-1,end=-1;
            
            while(true) {
                start = random.nextInt(100);
                if(hasSnakeOrLadder(start))continue;
                else break;
            }
            while(true) {
                end = random.nextInt(100);
                if( hasSnakeOrLadder(start) || end >= start)continue;
                else break;
            }
            //setEntity(start,new Snake(start,end));
        }
    }
    public void assignLadder(){
        int m=(cellCount*5)/100;
        for(int i=0;i<m;i++){
            int start=-1,end=-1;

            while(true) {
                start = random.nextInt(100);
                if(hasSnakeOrLadder(start))continue;
                else break;
            }
            while(true) {
                end = random.nextInt(100);
                if( hasSnakeOrLadder(end) || end < start)continue;
                else break;
            }
            setEntity(start,new Ladder(start,end));
        }
        
    }
    
    
    public boolean hasSnakeOrLadder(int pos){

        return this.map.containsKey(pos);
    }
    public void setEntity(int pos,BoardEntity e){
        
        map.put(pos,e);
    }
    
    public BoardEntity getEntity(int pos){
        
        if(hasSnakeOrLadder(pos))
            return map.get(pos);
        return null;
    }
    public void printBoard(){

        for(int i=cellCount-1; i>=0; i--) {
            System.out.print(i+" ");
            if(hasSnakeOrLadder(i)) {
                System.out.print(map.get(i).getString());
            }
            System.out.print("         ");
            
            if(i%10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
