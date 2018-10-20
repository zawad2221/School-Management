/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.util.InputMismatchException;

/**
 *
 * @author hp
 */
public class AccountCounterInputCheck {
    int check(String s)
    {
        int r=0;
        try{
            r=Integer.parseInt(s);
        }
        catch(NumberFormatException e)
        {
            r=0;
        }
        
        
        return r;
    }
    
}
