/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstracts;
import models.*;
import java.util.ArrayList;
import java.util.List;
import interfaces.*;

/**
 *
 * @author 62821
 */
public abstract class AbstractMahasiswaManager implements MahasiswaManager {
    protected List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tampilkanMahasiswa() {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("NIM: " + mahasiswa.getNim() + ", Nama: " + mahasiswa.getNama());
        }
    }
}
