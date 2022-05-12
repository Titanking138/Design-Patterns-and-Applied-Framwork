/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package singleton;

import java.sql.Connection;

/**
 *
 * @author IT069 arjun
 */
public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = Singleton.getConnection();
            System.out.println("Connection Succesful");
        } catch (Exception e) {
        }
    }
}
