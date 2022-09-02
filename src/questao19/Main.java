package questao19;

import java.util.Scanner;

/*
 * @author Priscila Butzke
 * 19 – Crie um algoritmo que armazene em um ArrayList de String uma lista de nomes de crianças 
 * – o programa deverá permitir:
Adicionar nome;
Alterar nome;
Excluir nome;
Listar todos os nomes;
Pesquisar um nome desejado;
Sair do programa.


 */
public class Main {

    public static void main(String[] args) {
        int op = 1;
        Scanner ler = new Scanner(System.in);
        Funcoes f = new Funcoes();

        while (op != 0) {
            System.out.println("Fila de crianças:"
                    + "\n1 - Adicionar"
                    + "\n2 - Alterar"
                    + "\n3 - Excluir"
                    + "\n4 - Listar"
                    + "\n5 - Pesquisar"
                    + "\n0 - Sair");
            op = ler.nextInt();

            switch (op) {
                case 1: //adicionar a fila
                    ler.nextLine();
                    Criancas criancas = new Criancas();
                    System.out.println("Digite o nome a ser adicionado: ");
                    criancas.setNome(ler.nextLine());
                    f.gravar(criancas);

                    break;
                case 2: //alterar
                    ler.nextLine();
                    Criancas c = new Criancas();
                    System.out.println("Digite o nome a ser alterado");
                    c.setNome(ler.nextLine());
                    int i = f.encontrarPessoa(c);
                    System.out.println("Digite o novo nome: ");
                    c.setNome(ler.nextLine());
                    f.alterar(i, c);
                    break;
                case 3: //excluir
                    ler.nextLine();
                    Criancas cri = new Criancas();
                    System.out.println("Digite o nome a ser excluido: ");
                    cri.setNome(ler.nextLine());
                    int ind = f.encontrarPessoa(cri);

                    if (ind != -1) {
                        f.excluir(ind);
                    } else {
                        System.out.println("Este contat0 não existe!");
                    }
                    break;
                case 4: //listar
                    System.out.println(f.listar());
                    break;

                case 5://pesquisar
                    ler.nextLine();
                    Criancas cr = new Criancas();
                    System.out.println("Digite o nome da criança a ser pesquisada: ");
                    cr.setNome(ler.nextLine());
                    int indi = f.encontrarPessoa(cr);
                    if (indi != -1) {
                        f.pesquisar(indi);
                    } else {
                        System.out.println("Este contato não existe!");
                    }

                    break;
            }

        }
    }
}
