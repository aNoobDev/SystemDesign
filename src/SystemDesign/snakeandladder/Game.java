package SystemDesign.snakeandladder;

import SystemDesign.snakeandladder.gameentity.Board;
import SystemDesign.snakeandladder.gameentity.BoardEntity;
import SystemDesign.snakeandladder.service.DiceService.Dice;
import SystemDesign.snakeandladder.users.Player;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    
    Queue<Player> players;
    Board board;
    Scanner sc;
    public Game(int n){
        players=new LinkedList<>();
        board=new Board(n);
        sc=new Scanner(System.in);
    }
    
    public void launchGame(){
        
        int k=0;
        while(players.size() != 1){
            
            Player p=players.poll();
            System.out.println(p.getName()+"'s turn");
            System.out.println("Press r to roll a dice");
            //char c=sc.next().charAt(0);
            makeMove(p);
            int newPos=p.getPosition();
            if(isWinner(newPos)){
                System.out.println(p.getName()+" has won the Game, Congratulations");
            }
            else
                players.add(p);
            printPositions();
            k++;
        }
        System.out.println(k);
    }
    public void makeMove(Player p){

        int num= Dice.roll();
        int currP=p.getPosition();
        System.out.println("You got "+num);
        int finalPos=currP+num;
        if(finalPos < 100){
            
            if(board.hasSnakeOrLadder(finalPos)){
                BoardEntity b=board.getEntity(finalPos);
                System.out.println(b.getEncounterMessage());
                finalPos=b.getEnd();
            }
        }else{
            System.out.println("Try again");
            finalPos=currP;
        }
        
        p.setPosition(finalPos);
    }
    private void printPositions() {
        for(Player player : players) {
            System.out.println(player.getName()+":"+player.getPosition());
        }

    }
    public boolean isWinner(int pos){
        
        return pos+1==100;
    }
    public void addPlayer(Player player){
        this.players.add(player);
    }
}
