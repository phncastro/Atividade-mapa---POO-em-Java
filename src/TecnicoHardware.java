public class TecnicoHardware extends Tecnico implements Atendimento{

    public TecnicoHardware(String nome, String especialidade) {
        super(nome, especialidade);
    }
    @Override
    public void realizarAtendimento() {
        IO.println("Realizando manutenção física do computador, verificando memória RAM e componentes.");
    }
}
