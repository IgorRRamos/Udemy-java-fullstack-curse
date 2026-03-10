import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1,num2;
        char operacao;

        while(true){
            System.out.print("Digite um numero: ");
            num1 = teclado.nextInt();

            System.out.println("+, -, /, *");
            operacao = teclado.next().charAt(0);

            System.out.print("Digite outro numero: ");
            num2 = teclado.nextInt();

            if(operacao == '+'){
                System.out.println(num1 + num2);
            }else if(operacao == '-'){
                System.out.println(num1 - num2);
            }else if(operacao == '*'){
                System.out.println(num1 * num2);
            }else if(operacao == '/'){
                System.out.println(num1 / num2);
            }
        }
    }
}