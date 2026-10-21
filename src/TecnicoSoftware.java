public class TecnicoSoftware extends Tecnico implements Atendimento {

    public TecnicoSoftware(String nome, String especialidade) {
        super(nome, especialidade);
    }
    @Override
    public void realizarAtendimento() {
        IO.println("Realizando manutenção de software, verificando sistema operacional e programas instalados.");
    }
}
