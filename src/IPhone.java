import java.util.Scanner;

public class IPhone {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("##### IPhone 8 #####");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("App Música  - (Digite 1)");
        System.out.println("Safari      - (Digite 2)");
        System.out.println("Telefone    - (Digite 3)");
        System.out.println("Desligar    - (Digite 0)");

        int menu = sc.nextInt();

        if (menu == 1){

            System.out.println("***** App Música *****");
            System.out.println(" ");
            ReprodutorMusical appMusica = new ReprodutorMusical();

            appMusica.adicionarMusica("Thriller - Michael Jackson");
            appMusica.adicionarMusica("Billie Jean - Michael Jackson");
            appMusica.adicionarMusica("Smooth Criminal - Michael Jackson");
            appMusica.adicionarMusica("Bad - Michael Jackson");
            appMusica.tocarPrimeiraMusica();
            System.out.println(" ");
            appMusica.verListaDeReproducao();
            System.out.println(" ");

            boolean menuMusica = true;

            while (menuMusica){
                System.out.println("1 - Musica Anterior");
                System.out.println("2 - Proxima Musica");
                System.out.println("3 - Pausar");
                System.out.println("0 - Sair");
                int play = sc.nextInt();

                if (play == 1){
                    appMusica.tocarMusicaAnterior();
                    appMusica.verListaDeReproducao();
                };
                if (play == 2){
                    appMusica.tocarProximaMusica();
                    appMusica.verListaDeReproducao();
                }
                if (play == 3){
                    appMusica.pausarMusica();
                    appMusica.verListaDeReproducao();
                }
                if (play == 0){
                    menuMusica = false;
                }
            }

        } else if (menu == 2) {

        } else if (menu == 3) {

        } else if (menu == 0) {
            System.out.println("Desligando IPhone...");
        }
        sc.close();
    }
}