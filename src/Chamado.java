import java.lang.reflect.Array;

public class Chamado {
    private int numero;
    private static int totalChamados = 0;
    private String descricao;
    private String status;
    private Computador computador;
    private Tecnico tecnico;
    private static Array listaChamados;

    public Chamado(int numero,
                   String descricao,
                   String status,
                   Computador computador,
                   Tecnico tecnico) {

        this.numero = numero;
        this.descricao = descricao;
        this.status = status;
        this.computador = computador;
        this.tecnico = tecnico;
        totalChamados += 1;
    }
    public Chamado(int numero,
                   String descricao,
                   String status) {

        this.numero = numero;
        this.descricao = descricao;
        this.status = status;
        totalChamados += 1;
    }

    // MÉTODOS
    void exibirInformacoes() {
        IO.println(
                "CHAMADO N° " + numero + "\n" +
                "\nDescrição: " + descricao +
                "\nStatus: " + status +
                "\nComputador: " + "\n" +
                "    patrimônio: " + computador.getPatrimonio() + "\n" +
                "    modelo: " + computador.getModelo() + "\n" +
                "    sistema operacional: " + computador.getSistemaOperacional() + "\n" +
                "    ligado: " + (computador.isLigado() ? "Sim" : "Não") +
                "\nTécnico: " + "\n" +
                "    nome: " + tecnico.getNome() + "\n" +
                "    especialidade: " + tecnico.getEspecialidade() + "\n"
        );
    }

    // GETTERS
    int getNumero() {
        return numero;
    }
    public static int getTotalChamados() {
        return totalChamados;
    }
    String getDescricao() {
        return descricao;
    }
    String getStatus() {
        return status;
    }
    Computador getComputador() {
        return computador;
    }
    Tecnico getTecnico() {
        return tecnico;
    }

    // SETTERS
    void setNumero(int numero) {
        this.numero = numero;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setComputador(Computador computador) {
        this.computador = computador;
    }
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}
