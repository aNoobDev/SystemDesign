package SystemDesign.snakeandladder.users;

public class Player extends User {
    
    int position;
    String name;
    public Player(String name){
        super(name);
        this.position=0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
