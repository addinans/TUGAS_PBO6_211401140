/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com;
import interfaces.*;
import managers.*;
/**
 *
 * @author 62821
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MahasiswaManager manager = new InnerMahasiswaManager();
        manager.tambahMahasiswa("Addina", "211401140");
        manager.tambahMahasiswa("Ichak", "211401029");
        manager.tampilkanMahasiswa();
        manager.hapusMahasiswa("211401140");
        manager.tampilkanMahasiswa();
    }
    
}
