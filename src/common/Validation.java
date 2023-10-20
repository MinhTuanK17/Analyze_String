/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author MINH TUAN
 */
public class Validation {

    public boolean checkOdd(int n) {
        if (n % 2 == 1) {
            return true;
        }
        return false;
    }

    public boolean checkEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public boolean checkSquareNumber(int n) {
        if (Math.sqrt(n) * Math.sqrt(n) == n) {
            return true;
        }
        return false;
    }
    
}
