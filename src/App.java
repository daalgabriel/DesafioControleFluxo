import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);
        Contador contador = new Contador();

        try {
            System.out.println("Digite o primeiro número: ");
            int parametro1 = entrada.nextInt();

            System.out.println("Digite o segundo número: ");
            int parametro2 = entrada.nextInt();

            contador.contar(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());

        } catch (Exception e){
            System.out.println("Erro: Insira valores inteiros válidos.");
            
        } finally {
            entrada.close();
        }
    }
}
