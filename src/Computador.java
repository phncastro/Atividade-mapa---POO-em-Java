public class Computador {
    private String patrimonio;
    private String modelo;
    private String sistemaOperacional;
    private boolean ligado;

    public Computador(String patrimonio,
                      String modelo,
                      String sistemaOperacional,
                      boolean ligado){
        this.patrimonio = patrimonio;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.ligado = ligado;
    }

    // MÉTODOS
    public void ligar(){
        if (!ligado) {
            ligado = true;
            }
    }
    public void desligar(){
        if (ligado) {
            ligado = false;
        }
    }
    public void exibirInformacoes(){
         IO.println(
                 "Patrimônio: " + patrimonio +
                 "\nModelo: " + modelo +
                 "\nSistema Operacional: " + sistemaOperacional +
                 "\nLigado: " + (ligado ? "Sim" : "Não") + "\n");
    }

    // GETTERS
    public String getPatrimonio() {
        return patrimonio;
    }
    public String getModelo() {
        return modelo;
    }
    public String getSistemaOperacional() {
        return sistemaOperacional;
    }
    public boolean isLigado() {
        return ligado;
    }

    // SETTERS
    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
