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
    }
}
