import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    static void main() {
        Computador computador1 = new Computador("Escritório 1",
                "Macbook pro",
                "MacOS",
                false);

        Computador computador2 = new Computador("Escritório 2",
                "Macbook m1",
                "MacOS",
                false);

        computador1.ligar();
        computador1.exibirInformacoes();
        computador1.desligar();

        computador2.ligar();
        computador2.desligar();
        computador2.exibirInformacoes();

        Computador computador3 = new Computador("Setor administrativo",
                "Notebook Samsumg",
                "Windows 11",
                false);

        Tecnico tecnico1 = new Tecnico("Pablo", "Manutenção");

        Chamado chamado1 = new Chamado(1, "Problemas técnicos", "aberto");

        chamado1.setComputador(computador1);
        chamado1.setTecnico(tecnico1);

        chamado1.exibirInformacoes();

        Tecnico tecnicoHardware = new TecnicoHardware("João", "Hardware");
        Tecnico tecnicoSoftware = new TecnicoSoftware("Matheus", "Software");

        tecnicoHardware.realizarAtendimento();
        tecnicoSoftware.realizarAtendimento();

        Scanner scanner = new Scanner(System.in);
        IO.println("Digite o número de um chamado: ");
        try {
            int numeroChamado = scanner.nextInt();

        } catch (InputMismatchException e) {
            IO.println("Erro: Chamados possuem números inteiros.");
        }

        Chamado chamado2 = new Chamado(2,"Erro de permissão no sistema","Aberto", computador3, tecnicoSoftware);
        Chamado chamado3 = new Chamado(3,"Sistema travando","Encerrado", computador1, tecnicoSoftware);
        Chamado chamado4 = new Chamado(4,"Computador não liga","Aberto", computador2, tecnicoHardware);

        IO.println("O número total de chamados é de: " + Chamado.getTotalChamados());
    }
}

