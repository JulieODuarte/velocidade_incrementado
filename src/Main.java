import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione qual dessas opções você deseja calcular. Digite:");
        System.out.println("1 - Distância percorrida");
        System.out.println("2 - Velocidade");
        System.out.println("3 - Aceleração");
        int opc = scanner.nextInt();

        switch (opc) {
            case 1: distP(); break;
            case 2: velocidade(); break;
            case 3: aceleracao(); break;
            default:
                System.out.println("Opção Inválida!");
        }

    }
    public static void distP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Velocidade Inicial:");
        double vInicial = scanner.nextDouble();
        System.out.println("Digite o Tempo:");
        double temp = scanner.nextDouble();
        System.out.println("Digite a Aceleração:");
        double acel = scanner.nextDouble();
        double dPercorrido = ((vInicial * temp) + ((1.0 / 2.0) * acel * (temp * temp)));
        //para a formula funcionar preciso colocar 1.0 porque estou usando double
        System.out.printf("\nA distância percorrida foi: %s\n", dPercorrido);
    }
    public static void velocidade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Tempo:");
        double temp = scanner.nextDouble();
        System.out.println("Digite a Aceleração:");
        double acel = scanner.nextDouble();
        double veloDelta = acel*temp;
        System.out.printf("\nA velocidade é: %s\n", veloDelta);
    }
    public static void aceleracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Tempo:");
        double temp = scanner.nextDouble();
        System.out.println("Digite a Velocidade:");
        double velo = scanner.nextDouble();
        double acel=velo/temp;
        System.out.printf("\nA aceleração é: %s\n", acel);
    }
}