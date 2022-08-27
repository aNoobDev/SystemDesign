package SystemDesign.snakeandladder.gameentity;

public class Snake extends BoardEntity{
    
    public Snake(int start,int end){
        
        super(start,end);
    }

    @Override
    public String getEncounterMessage() {
        return "Oops, You encountered a Snake";
    }

    @Override
    public String getString() {
        return "S("+this.getEnd()+")";
    }

}
