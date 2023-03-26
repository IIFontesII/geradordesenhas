import java.util.Scanner;
import java.util.Random;
public class loops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("\n" +
                "  ### #### ##     #   ###     #   ##     ###   ####    ### #### #  ## #   #   #     #   #   #     ## # ## #### ##\n" +
                " #  # #    # #   # #  #  #   # #  # #    #  #  #      #  # #    ##  # #   #  # #    #   #  # #   # # # #  #    # #\n" +
                "#     #### # #   # #  #   # #   # # #    #   # ####   ##   #### # # # #####  # #    #####  # #  #    ##   #### # #\n" +
                "#  ## #  # ##    ###  #   # #   # ##     #   # #  #     ## #  # # # # #   #  ###    #   #  ###  #    ##   #  # ##\n" +
                "##  # #    # #  #   # #  #   # #  # #    #  #  #      #  # #    #  ## #   # #   #   #   # #   #  # # # #  #    # #\n" +
                "  ### #### #  # #  ## ###     #   #  #   ###   ####   ###  #### ##  # #   # #  ##   #   # #  ##   ## #  # #### #  #");
        System.out.println("███████████████████████████\n" +
                "███████▀▀▀░░░░░░░▀▀▀███████\n" +
                "████▀░░░░░░░░░░░░░░░░░▀████\n" +
                "███│░░░░░░░░░░░░░░░░░░░│███\n" +
                "██▌│░░░░░░░░░░░░░░░░░░░│▐██\n" +
                "██░└┐░░░░░░░░░░░░░░░░░┌┘░██\n" +
                "██░░└┐░░░░░░░░░░░░░░░┌┘░░██\n" +
                "██░░┌┘▄▄▄▄▄░░░░░▄▄▄▄▄└┐░░██\n" +
                "██▌░│██████▌░░░▐██████│░▐██\n" +
                "███░│▐███▀▀░░▄░░▀▀███▌│░███\n" +
                "██▀─┘░░░░░░░▐█▌░░░░░░░└─▀██\n" +
                "██▄░░░▄▄▄▓░░▀█▀░░▓▄▄▄░░░▄██\n" +
                "████▄─┘██▌░░░░░░░▐██└─▄████\n" +
                "█████░░▐█─┬┬┬┬┬┬┬─█▌░░█████\n" +
                "████▌░░░▀┬┼┼┼┼┼┼┼┬▀░░░▐████\n" +
                "█████▄░░░└┴┴┴┴┴┴┴┘░░░▄█████\n" +
                "███████▄░░░░░░░░░░░▄███████\n" +
                "██████████▄▄▄▄▄▄▄██████████\n" +
                "███████████████████████████\n");
        System.out.println("~ $keleton: Fala meu consagrado. Seja muito bem vindo à calculadora hacker");
        System.out.println("~ $keleton: Digite 'gen' para começar a gerar sua senha forte ");

        String resposta_data = scan.nextLine();
        String resposta_user = resposta_data;
        String[] pass = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "!","@","$","#","&"};

        if(resposta_user.equals("gen")) {
            System.out.println("Quantas senhas deseja gerar?");
            String resposta_quant_senhas = scan.nextLine();
            String resposta_user_senhas = resposta_quant_senhas;

            for(int i = 0; i < Integer.parseInt(resposta_user_senhas); i++) {
                Random math = new Random();
                
                int numero_senha = math.nextInt(24);
                int numero_senha01 = math.nextInt(24);
                int numero_senha02 = math.nextInt(24);
                int numero_senha03 = math.nextInt(24);
                int numero_senha04 = math.nextInt(24);
                int numero_senha05 = math.nextInt(24);
                int numero_senha06 = math.nextInt(24);
                int numero_senha07 = math.nextInt(24);
                
                System.out.println(pass[numero_senha] +
                                   pass[numero_senha01] +
                                   pass[numero_senha02] +
                                   pass[numero_senha03] +
                                   pass[numero_senha04] +
                                   pass[numero_senha05] +
                                   pass[numero_senha06] +
                                   pass[numero_senha07]);
            }
        }
    }
}
