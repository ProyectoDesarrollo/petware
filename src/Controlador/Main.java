/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import vista.Login;
import vista.Principal;

/**
 *
 * @author rober
 */
public class Main {
    
    public static void main(String[] args) {
        
        try {
                    
        } catch (Exception e) {
            e.printStackTrace();
        }
         //main
         new controlador(new Login(), new Principal()).iniciar();
         

    }
}
