package lista_iv_1;

import java.util.Scanner;

public class run {
    public static Scanner keyboard = new Scanner(System.in);

    static void menu() {
        System.out.println();
        System.out.println("1 - Adicionar Pessoa");
        System.out.println("2 - Adicionar E-mail");
        System.out.println("3 - Adicionar Telefone");
        System.out.println("4 - Exibir Pessoas");
        System.out.println("5 - Exibir os Contatos da Pessoa");
        System.out.println("6 - Exibir pessoas com e-mail");
        System.out.println("7 - Exibir a pessoa pelo e-mail");
        System.out.println("8 - Exibir a pessoa pelo telefone");
        System.out.println("9 - Sair");
        System.out.println();
    }
    
    public static void main(String[] args) {
        String nome, email, telefone;
        int i;

        Agenda agenda = new Agenda("Roger");

            while(true) {
                menu();

                i = keyboard.nextInt();

                    switch (i) {
                        case 1:
                            System.out.print("Informe o nome da pessoa: ");
                            nome = keyboard.nextLine();
                            nome = keyboard.nextLine();
                            agenda.addPessoa(new Pessoa(nome));
                            break;
                        case 2:
                            System.out.print("Informe o nome da pessoa onde você pretende adicionar um contato: ");
                            nome = keyboard.nextLine();
                            nome = keyboard.nextLine();
                            System.out.print("Informe o e-mail para ser adicionado: ");
                            email = keyboard.nextLine();
                            agenda.addContato(nome, new Email(email));
                            break;
                        case 3:
                            System.out.print("Informe o nome da pessoa onde você pretende adicionar um contato: ");
                            nome = keyboard.nextLine();
                            nome = keyboard.nextLine();
                            System.out.print("Informe o telefone para ser adicionado: ");
                            telefone = keyboard.nextLine();
                            agenda.addContato(nome, new Telefone(telefone));
                            break;
                        case 4:
                            System.out.println(agenda.exibirPessoas());
                            break;
                        case 5:
                            System.out.print("Informe o nome da pessoa que você pretende visualizar os contatos: ");
                            nome = keyboard.nextLine();
                            nome = keyboard.nextLine();
                            agenda.exibirContatosPessoas(nome);
                            break;
                        case 6:
                            agenda.exibirPessoasComEmail();
                            break;
                        case 7:
                            System.out.print("Informe o e-mail para retornar a pessoa correspondente: ");
                            email = keyboard.nextLine();
                            email = keyboard.nextLine();
                            System.out.println(agenda.recuperarPessoaPorEmail(email));
                            break;
                        case 8:
                            System.out.print("Informe o telefone para retornar a pessoa correspondente: ");
                            telefone = keyboard.nextLine();
                            telefone = keyboard.nextLine();
                            System.out.println(agenda.recuperarPessoaPorTelefone(telefone));
                            break;
                        case 9:
                            System.out.println("Saiu do Sistema");
                            keyboard.close();
                            return;
                        default:
                            System.out.println("Selecione um número válido");
                            keyboard.close();
                            return;
                    }
            }
    }
}
