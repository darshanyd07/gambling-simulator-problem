public class gambling_problem_UC2
{
    public static void main(String[] darsh)
    {
        int total_Amount = 100;
        int bet = 1;
        System.out.println("-------Welcome to the Gambling Problem------");
        int gameAmount = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println(gameAmount);

        if (bet == gameAmount) {
            System.out.println("Gambler win the game");
            total_Amount++;
        } else {
            System.out.println("Gambler Loss the game");
            total_Amount--;
        }
        System.out.println("The total amount of gambler are : " + total_Amount);
    }
}
