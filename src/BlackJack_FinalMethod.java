import java.util.*;
public class BlackJack_FinalMethod {
    Random random=new Random();
    Scanner scan=new Scanner(System.in);
    int dealer_value=0;
    int player_value=0;
    boolean constant=true;
    public BlackJack_FinalMethod(){
        start();
    }
    public void start(){
        while(constant){
            dealer_value+= random.nextInt(11)+1;
            System.out.println("Dealer:"+dealer_value);
            player_value+=random.nextInt(11)+1;
            System.out.println("You:"+player_value);
            if(player_value>21){
                System.out.println("Bust!");
                constant=false;
                break;
            }
            System.out.println("Hit or Stand");
            String answer=scan.next();
            if(answer.compareTo("Stand")==0){
                dealer_turn();
                break;
            }
            if(answer.compareTo("Hit")==0){
                continue;
            }
        }


    }
    public void dealer_turn(){
        while(dealer_value<17){
            dealer_value+=random.nextInt(11)+1;
            System.out.println("Dealer:"+dealer_value);
            System.out.println("You:"+player_value);
        }
        if(dealer_value>21 || player_value>dealer_value){
            System.out.println("You win!");
        } else if (player_value==dealer_value) {
          System.out.println("Push!");
            
        }
        else{
            System.out.println("Dealer Wins!");
        }
        constant=false;

    }

}
