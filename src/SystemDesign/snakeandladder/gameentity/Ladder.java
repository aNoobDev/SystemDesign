package SystemDesign.snakeandladder.gameentity;

public class Ladder extends BoardEntity {

    public Ladder(int start,int end){
        super(start,end);
    }

    @Override
    public String getEncounterMessage() {
        return "You got a ladder to climb";
    }

    @Override
    public String getString() {
        return "L("+this.getEnd()+")";
    }
    
    
}
