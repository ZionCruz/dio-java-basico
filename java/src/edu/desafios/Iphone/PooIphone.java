package edu.desafios.Iphone;

public class PooIphone {
    private ReprodutorMusical reprodutorMusical = new ReprodutorMusical() {
        @Override
        public void tocar() {
            System.out.println("Tocando música...");
        }

        @Override
        public void pausar() {
            System.out.println("Música pausada.");
        }

        @Override
        public void selecionarMusica(String musica) {
            System.out.println("Música selecionada: " + musica);
        }
    };

    private NavegadorInternet navegadorInternet = new NavegadorInternet() {
        @Override
        public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
        }

        @Override
        public void adicionarNovaAba() {
            System.out.println("Nova aba adicionada.");
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Página atualizada.");
        }
    };

    private AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico() {
        @Override
        public void ligar(String numero) {
            System.out.println("Ligando para: " + numero);
        }

        @Override
        public void atender() {
            System.out.println("Atendendo chamada...");
        }

        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Correio de voz iniciado.");
        }
    };

    // Métodos que delegam as chamadas para as instâncias internas
    public void tocar() {
        reprodutorMusical.tocar();
    }

    public void pausar() {
        reprodutorMusical.pausar();
    }

    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }

    public void ligar(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void atender() {
        aparelhoTelefonico.atender();
    }

    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        PooIphone iphone = new PooIphone();

        // Testando ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Imagine - John Lennon");

        // Testando NavegadorInternet
        iphone.exibirPagina("http://www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Testando AparelhoTelefonico
        iphone.ligar("1234567890");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
