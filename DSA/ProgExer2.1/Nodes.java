/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphing;

/**
 *
 * @author jgfabul
 */
public class Nodes {
    protected char object;
    protected Nodes left, right;
    public Nodes(char x){
        this.object = x;
        left = right = null;
    }

    public char getObject() {
        return object;
    }

    public void setObject(char object) {
        this.object = object;
    }

}
