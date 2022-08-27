package SystemDesign.snakeandladder.gameentity;

public abstract class BoardEntity {
    
    int start,end;
    
    public BoardEntity(int start,int end){
        
        this.start=start;
        this.end=end;
    }

    public abstract String getEncounterMessage();
    public abstract String getString();
    
    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
