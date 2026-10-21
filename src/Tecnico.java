public class Tecnico implements Atendimento{
    private String nome;
    private String especialidade;

    public Tecnico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    // MÉTODOS
    public void realizarAtendimento() {
    }

    // GETTERS
    String getNome() {
        return nome;
    }
    String getEspecialidade() {
        return especialidade;
    }

    // SETTERS
    void setNome(String nome) {
        this.nome = nome;
    }
    void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
