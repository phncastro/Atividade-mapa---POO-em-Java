void main(String[] args) {
    String nomeDoSistema = "ITSolutions";
    Double versao = 1.0;
    String nomeDeUmTecnico = "Pablo Henrique";
    int quantidadeDeChamadosAbertos = 0;
    String statusDoSistema = null;

    if (quantidadeDeChamadosAbertos > 0) {
        IO.println("Existem chamados aguardando atendimento");
    } else {
        IO.println("Nenhum chamado pendente");
    }

    IO.println("Nome do sistema: " + nomeDoSistema);
    IO.println("Versão: " + versao);
    IO.println("Técnico: " + nomeDeUmTecnico);
    IO.println("Quantidade de chamados Abertos: " + quantidadeDeChamadosAbertos);
    IO.println("Status do sistema: " + statusDoSistema);

}