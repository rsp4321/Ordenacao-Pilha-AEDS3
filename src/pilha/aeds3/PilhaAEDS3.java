/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha.aeds3;

import java.util.Stack;

/**
 *
 * @author aluno
 */
public class PilhaAEDS3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stack<Integer> pilha = new Stack<>();
        pilha.push(12);
        pilha.push(3);
        pilha.push(9);
        pilha.push(7);
        pilha.push(15);
        pilha.push(5);
        pilha.push(10);

        // A pilha já está criada        
    }

    //public static void insertionSort(int[] vetor) {
    public static void insertionSort(Stack<Integer> pilha) {

        Stack<Integer> pilhaAux = new Stack<>();
        Stack<Integer> pilhaOrdena = new Stack<>();

//        int j;
        //int key;
        int elemento, proximo, ordenado;
        int i;

//        for (j = 1; j < vetor.length; j++) {
        // No caso, por se tratar de pilhas, não percorreremos com um loop
        // percorreremos desempilhando elementos  enquanto eles forem menores que o elemento selecionado
//        
        //key = vetor[j];
//        
//
        // Começando com o topo da pilha
        // MArcando o elemento para comparar com os demais em baixo
        elemento = pilha.pop(); // o método pop() pega um numero da pilha
        
        
//        proximo = pilha.pop(); //pegar um numero da pilha

        // Percorrendo a pilha por elementos menores
        while (!pilha.empty()) {
         
            proximo = pilha.pop();
            
            if (elemento > proximo) {
             
                // Nesse caso, o nosso elemento deverá ficar abaixo na pilha
                // Para não perder a ordem original acima, vamos colocar numa pilha auxiliar
                pilhaAux.push(proximo);
            }
            else
                // no caso, paramos o loop por aqui para empilharmos os elementos que tiramos na ordem original
                break;
        }

//      for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {
        if (proximo > elemento){

//            
//
//          vetor[i + 1] = vetor[i];
            proximo = elemento;

        }
        //vetor[i + 1] = key;

        proximo = elemento;
        pilhaAux.push(proximo); //inserir um numero da pilha auxiliar
    }
}

}
