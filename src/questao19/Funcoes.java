package questao19;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Priscila Butzke 19 – Crie um algoritmo que armazene em um ArrayList
 * de String uma lista de nomes de crianças – o programa deverá permitir:
 * Adicionar nome; ok Alterar nome; ok Excluir nome; ok Listar todos os nomes;
 * ok Pesquisar um nome desejado; Sair do programa.
 */
public class Funcoes {

    public ArrayList<Criancas> fila = new ArrayList();
    Scanner ler = new Scanner(System.in);

    //adiciona pessoa a fila
    public void gravar(Criancas c) {
        fila.add(c);
        System.out.println(c.getNome() + ", adicionado(a) na fila com sucesso!");
    }

    //alterar nome
    public void alterar(int i, Criancas c) {
        fila.set(i, c);
        System.out.println("Contato alterado com sucesso!");
    }
    //excluir nome

    public void excluir(int i) {
        int op;
        Scanner ler = new Scanner(System.in);
        System.out.println("Tem certeza? (1 = S ou 2 = N");
        op = ler.nextInt();
        if (op == 1) {
            fila.remove(i);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Exclusão cancelada");
        }
    }

    //listar crianças
    public String listar() {
        String resultado = "Lista de Contatos \n";
        if (fila.isEmpty()) {
            resultado = " A sua agenda está vazia";
        } else {
            for (int i = 0; i < fila.size(); i++) {
                resultado += fila.get(i).getNome() + "\n";
            }
        }
        return resultado;
    }
//lista a criança através do indice
    public void pesquisar(int c) {
        System.out.println("Nome:" + fila.get(c).getNome());

    }
    
    //busca através do nome digitado, quando encontra guarda o indice a variavel aux
    public int encontrarPessoa(Criancas c) {
        int aux = -1;
        for (int i = 0; i < fila.size(); i++) {
            if (fila.get(i).getNome().equals(c.getNome())) {
                aux = i;
            }
        }
        return aux;
    }

}
