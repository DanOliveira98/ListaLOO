/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Danie
 */
public class ListNode extends L{
    private L fist;
    private int size;
    public ListNode(){
        
    }

    public L getFist() {
        return fist;
    }

    public void setFist(L fist) {
        this.fist = fist;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public ListNode(ListNode l){
        fist = l.getFist();
        size = l.size();
    }
    public int size(){
        System.out.println(size);
    return size; 
    }
    public void print(){
        for(L cursor = fist; cursor!= null; cursor = cursor.next){
            System.out.println(cursor.val);
        }
    }
    public void add(Object v, int index){
        if(isEmpty()){
            fist = new L(v, fist);
        }else{
            L cursor = fist;
            for(int i=0; i< index-1; i++){
                cursor = cursor.next;
            }
            cursor.next = new L(v, cursor.next);
        }
        size++;
    }
    public void addFist(Object v){
        fist = new L(v, fist);
        size++;
    }
    public void removeFist(){
        fist = fist.next;
        size--;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void mudPos(int v){
        for(L cursor = fist; cursor!= null; cursor = cursor.next){
            if(cursor.next==null){
                cursor.next = fist;
            }
        }
         fist = fist.next;
    }
}
