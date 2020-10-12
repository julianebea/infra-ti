import java.util.Scanner;
class Fatorial{
    public static void main(String [] args){

        Scanner read = new Scanner(System.in);
        
        int numero; 

        System.out.println("Exemplo de cálculo de fatorial de um número em Java: ");
        System.out.println("Insira um número para calcular o fatorial: ");
        numero = read.nextInt();
        System.out.println("O fatorial de " + numero + " é: " + fatorial(numero));
    }
        public static int fatorial(int numero){
            int fator = 1;
            for(int i = 1; i<=numero; i++){
                fator *= i; 
            }
            return fator; 
        }
}