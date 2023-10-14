package main.java.set.Pesquisa;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Adriano", 123456);
        agendaContatos.adicionarContato("Paulo", 124856);
        agendaContatos.adicionarContato("Adriano Jose", 121111);
        agendaContatos.adicionarContato("Adriano MM", 1255566);
        agendaContatos.adicionarContato("Ariane", 123856);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Adriano"));

        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Ariane", 5555555));
        agendaContatos.exibirContato();
    }
}

