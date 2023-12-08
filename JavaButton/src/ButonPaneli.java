import javax.swing.*;
import java.awt.*;

public class ButonPaneli extends JFrame {
    /*JFrame, butonların içinde bulunduğu bir pencere gibi düşünülebilir.
     JFrame sınıfını extends ederek butonların yerleşeceği pencereyi oluşturdum. */

    private JButton[][] butonlar; /* 4x4 bir buton paneli oluşturmam istendiği için paneli, matris
    şeklinde bir dizi olarak düşündüm ve JButton'u kullanarak dizi elemanlarımın butonlardan
    oluşacağını belirttim.*/
    private final ButonTiklandiginda butonTiklandigindaListener = new ButonTiklandiginda();
    //ButonTiklandiginda sınıfını kullanabilmek için onun türünde bir değişken oluşturdum.

    public ButonPaneli(){
        super("Buton Paneli");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Kapatma operasyonunu JFrame'in default halinden aldım.
        setSize(400,400); //Pencerenin genişlik ve yükseklik değerlerini belirledim.
        setLayout(new GridLayout(4,4)); /* setLayout'la butonun pencere içindeki konumu belirlenir.
        Bunun için 'GridLayout' yöneticisinin kullanılacağını ve bu düzenin 4x4 bir matris olduğundan 4 satır,
        4 sütundan oluştuğunu belirttim. */

        butonlar = new JButton[4][4]; // Matris dizimin kaça kaç olacağını girdim.
        ButonOlustur butonOlusturucu = new ButonOlustur();//ButonOlustur sınıfına erişim için bir değişken tanımladım.

        // Buton matrisini oluşturup her bir butonu pencereye eklemesini sağladım.
        for (int i=0 ; i<4 ; i++){
            for (int j=0 ; j<4 ; j++){
               butonlar[i][j] = butonOlusturucu.butonOlustur(); // Dizi elemanı olarak atadığım butonları ButonOlustur sınıfında butonOlustur() methodunu kullanarak JButton türünde bir buton oluşturmasını sağladım.
               butonlar[i][j].addActionListener(butonTiklandigindaListener); // Burada butonları ButonTiklandiginda sınıfına göndererek aktiflik pasiflik durumlarına göre renklerinin ve etiketlerinin ne olacağını belirlemesini sağladım.
               add(butonlar[i][j]); // Her oluşturulan dizideki buton elemanlarının diziye eklenmesini sağladım.
            }
        }

    }


}
