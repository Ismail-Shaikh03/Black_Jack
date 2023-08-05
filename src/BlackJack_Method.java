import java.util.*;
public class BlackJack_Method {
    Random dealer=new Random();
    Random player=new Random();
    Scanner scanner=new Scanner(System.in);
    int dealer_value=0;
    int player_value=0;
    boolean constant=true;
    boolean holder=true;
    public BlackJack_Method(){
        start();

    }
    public void start() {
        while (constant = true) {
            dealer_value += dealer.nextInt(11) + 1;
            System.out.println("Dealer:" + dealer_value);
            player_value += player.nextInt(11) + 1;
            System.out.println("You:" + player_value);
            System.out.println("Stand or Hit");
            String answer = scanner.next();
            if (answer.compareTo("Stand") == 0) {
                dealer_value += dealer.nextInt(11) + 1;
                System.out.println("Dealer:" + dealer_value);
                System.out.println("You:" + player_value);
                stand();
                break;
            }
            if (answer.compareTo("Hit") == 0) {
                continue;
            }
            if (player_value > 21) {
                System.out.println("Bust!");
                constant = false;
            }
            if (player_value == 21 || dealer_value > 21) {
                System.out.println("You Win!");
                constant = false;
            }
            if (dealer_value == 21 && player_value == 21) {
                push();
            }
        }
    }
    public void push(){
        System.out.println("Nobody Wins!");
        constant=false;
    }
    public void stand(){
            dealer_value+=dealer.nextInt(11)+1;
            if (player_value > 21) {
                System.out.println("Bust!");
                constant = false;
        }
            if (player_value == 21 || dealer_value > 21) {
                System.out.println("You Win!");
                constant = false;
        }
            if (dealer_value == 21 && player_value == 21) {
                push();
            }
    }
    public void hit(){
        if (player_value > 21) {
            System.out.println("Bust!");
            constant = false;
        }
        if (player_value == 21 || dealer_value > 21) {
            System.out.println("You Win!");
            constant = false;
        }
        if(dealer_value>21){
            System.out.println("You Win");
            constant=false;
        }
        if (dealer_value == 21 && player_value == 21) {
            push();
        }
    }
    }


