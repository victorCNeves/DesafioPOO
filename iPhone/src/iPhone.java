import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void ligar(String numero) {
        System.out.println("Ligando para "+numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página com endereço "+url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música "+musica+" selecionada");
    }
}