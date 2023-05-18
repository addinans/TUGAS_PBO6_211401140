/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managers;
import abstracts.*;
import models.*;
import java.util.Iterator;

/**
 *
 * @author 62821
 */
public class InnerMahasiswaManager extends AbstractMahasiswaManager{
    @Override
    public void tambahMahasiswa(String nama, String nim) {
        daftarMahasiswa.add(new Mahasiswa(nama, nim));
    }
    
    @Override
    public void hapusMahasiswa(String nim) {
        for (Iterator<Mahasiswa> iterator = daftarMahasiswa.iterator(); iterator.hasNext(); ) {
            Mahasiswa mahasiswa = iterator.next();
            if (mahasiswa.getNim().equals(nim)) {
                iterator.remove();
                break;
            }
        }
    }
}
