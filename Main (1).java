import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to the zomato website");
        System.out.println("choose the mess");
        System.out.println("1.amma mess");
        System.out.println("2.karur tifen center");
        System.out.println("3.anpu mess");
        System.out.println("4.almalic");
        System.out.println("5.munandi vilas");
        System.out.println("choose your hotel(1-5)");
        int mess=sc.nextInt();
        
        switch( mess){
            case 1:
                System.out.println("you are choose amma mess");
                break;
            case 2:
                System.out.println("you are choose karur tifen center");
                break;
            case 3:
                System.out.println("you are choose annpu mwss");
                break;
            case 4:
                System.out.println("you are choose almalic");
                break;
            case 5:
                System.out.println("you are choose munandi vilas");
                break;
            default:
            System.out.println("exit");
            sc.close();
        }
        
    }
}