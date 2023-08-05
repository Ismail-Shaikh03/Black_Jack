import java.util.*;
public class BlackJack_Method2 {
    Random dealer=new Random();
    Random player=new Random();
    Scanner scanner=new Scanner(System.in);
    int dealer_value=0;
    int player_value=0;
    boolean constant=true;
    boolean holder=true;
    public BlackJack_Method2(){
        start();

    }
    public void start(){
        while(constant=true){
            dealer_value+=dealer.nextInt(11)+1;
            System.out.println("Dealer:"+dealer_value);
            player_value+=player.nextInt(11)+1;
            System.out.println("You:"+player_value);
            System.out.println("Stand or Hit");
            String answer=scanner.next();
                if(answer=="Stand") {
                    while(dealer_value<player_value){
                        stand();
                    }
                }
                if(answer=="Hit"){
                    continue;
             }

                if(player_value>21){
                 System.out.println("Bust!");
                    constant=false;
                    break;
             }
                if(player_value==21 || dealer_value>21){
                    System.out.println("You Win!");
                    constant=false;
                    break;
                }
                if(dealer_value==21 && player_value==21){
                    push();
                    constant=false;
                    break;
                }

         }


    }
    public void push(){
        System.out.println("Nobody Wins!");
    }
    public void stand(){
        dealer_value += dealer.nextInt(11) + 1;
        System.out.println("Dealer:" + dealer_value);
        System.out.println("You:" + player_value);
    }
}

