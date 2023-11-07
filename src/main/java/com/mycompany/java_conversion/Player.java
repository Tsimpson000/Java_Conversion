/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_conversion;

/**
 *
 * @author SHEEVZ
 */
public class Player {

    
    // Fields
    String _name;
    int _number;
    
    
    //constructor
    public Player(String _name, int _number) {
        this._name = _name;
        this._number = _number;
    }
    
    
    //properties
        public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getNumber() {
        return _number;
    }
    
    public void setNumber(int _number) {
        this._number = _number;
    }
    
    //Methods
    @Override
    public String toString() {
        return "Name - " + _name + " Number - " + _number ; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    

    
}
