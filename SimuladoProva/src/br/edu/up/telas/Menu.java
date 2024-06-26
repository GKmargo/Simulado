package br.edu.up.telas;

import br.edu.up.util.Prompt;
public class Menu {
    public void mostrar(){
        Prompt.limparConsole();
        Prompt.separador();
        Prompt.imprimir("MENU PRINCIPAL");
        Prompt.separador();

        Prompt.imprimir("Digite uma das opções:");
        Prompt.imprimir("\t1 - Pessoas");
        Prompt.imprimir("\t2 - Endereço");
        Prompt.imprimir("\t3 - Ambos Pessoas e Endereços");
        Prompt.imprimir("\t4 - Sair ");

        int opcao = Prompt.lerInteiro("Digite o numero de uma das opções: ");

        switch (opcao) {
            case 1:
                
                break;
            case 2:
               
                break;
            case 3:
                
                break;
            case 4:
                encerrarPrograma();
                break;
            default:
                Prompt.imprimir("Valor Inválido.");
                break;
        }
        mostrar();
    }
    
    public void encerrarPrograma(){
        Prompt.separador();
        Prompt.imprimir("Encerrando o programa...");
        System.exit(5);
    }
}

