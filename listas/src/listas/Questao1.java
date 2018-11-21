/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import java.util.*;

/**
 *
 * @author Danie
 */
public class Questao1 {
    public static void main(String[] args) {
        Scanner rec = new Scanner(System.in);
        ListNode ln = new ListNode();
        ln.print();
        System.out.println("Informe a posição do nó 'ln'");
        int n = rec.nextInt();
        for(int i = 0; i < n; i++){
            ln.addFist(i);
        }
        ln.print();
        System.out.println("---------------");
        L x;
        x = ln.getFist();
        ln.removeFist();
        ln.add(x.val, n-1);
        ln.print();
    }
}
