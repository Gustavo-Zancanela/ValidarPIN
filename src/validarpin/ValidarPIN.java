
package validarpin;

import java.util.Scanner;

public class ValidarPIN {

    
    public static void main(String[] args) {
        int pin = 1234;
       
       Scanner sc = new Scanner(System.in);
       
        System.out.println("Digite sua senha ");
        int inserir = sc.nextInt();
        
        while(inserir != pin) //quando o usuario errar a senha, deve aparecer que esta errada e pedir novamente para digitar a senha
        {
            System.out.println("Senha errada, digite novamente ");
            inserir = sc.nextInt();
        }
        
        System.out.println("Senha correta");//exibe esta mensagem quando a senha certa for digitada
        sc.close();
    }
    
}
