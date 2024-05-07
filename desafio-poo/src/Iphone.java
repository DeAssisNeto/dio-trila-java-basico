import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusica;

public class Iphone implements ReprodutorMusica, AparelhoTelefonico, NavegadorInternet {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.println("=====================================");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("=====================================");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("=====================================");

        ReprodutorMusica iphoneMusica = new Iphone();
        iphoneMusica.pausar();
        iphoneMusica.tocar();
        iphoneMusica.selecionarMusica();
        System.out.println("=====================================");

        AparelhoTelefonico iphoneTelefone = new Iphone();
        iphoneTelefone.ligar();
        iphoneTelefone.atender();
        iphoneTelefone.iniciarCorreioVoz();
        System.out.println("=====================================");

        NavegadorInternet iphoneInternet = new Iphone();
        iphoneInternet.exibirPagina();
        iphoneInternet.adicionarNovaAba();
        iphoneInternet.atualizarPagina();




    }

    @Override
    public void tocar() {
        System.out.println("Musica tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

}