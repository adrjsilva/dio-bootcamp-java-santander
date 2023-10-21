import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("ligando");

    }

    @Override
    public void atender() {
        System.out.println("atendeu");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz iniciado");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Página aberta");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada, tocando");
    }

    public Iphone() {
    }


}
