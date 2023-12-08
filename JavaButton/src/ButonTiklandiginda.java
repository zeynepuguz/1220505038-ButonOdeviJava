import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonTiklandiginda implements ActionListener {
    private JButton sonTiklananButon; // Son tıklanan buton değişkeni oluşturdum.
    private final Color aktifRenk = Color.CYAN; // Herhangi bir rengin üzerine tıklandığında tıklanan butonun rengi
    private final Color pasifRenk = Color.GRAY; // Pasif herhangi bir butonun rengi

    // Burada bir butonun üzerine tıklanıp tıklanmamasına göre nasıl bir aksiyona sahip olacağını belirleyen durumlar yer almaktadır.
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton aktifButon = (JButton) e.getSource();

        if (aktifButon == sonTiklananButon) { // Eğer zaten tıklanan butona tekrar tıklandıysa;
            pasifYap(aktifButon); // Onu pasif hale getir.
            sonTiklananButon = null; // Son tıklanan butonu temizle.
        } else {
            // Eğer farklı bir butona tıklandıysa;
            pasifYapTumAktifler();// Önceki tıklanan tüm aktif butonları pasif hale getir.
            aktifYap(aktifButon);// Şu anki butonu aktif hale getir.
            sonTiklananButon = aktifButon; // Son tıklanan butonu aktif butona çevir
        }


        // GraphQL mutation çalıştırma (simülasyon)
        String graphQLSemaAdresi = (String) aktifButon.getClientProperty("GraphQLSemaAdresi");
       GraphQLSemaAdresi graphQLSemaAdres = new GraphQLSemaAdresi();
       graphQLSemaAdres.GraphQLSemasiniBaslat(graphQLSemaAdresi);

    }

    //Butonu aktifleştirip arkaplanını aktif renk yapan ve aktif sembolle etiketleyen method
    private void aktifYap(JButton button) {
        button.setBackground(aktifRenk); // Arkaplan aktif renge döndü.
        button.setText((String) button.getClientProperty("AktifSembol")); // Buton aktif sembolle etiketlendi.
    }

    //Butonu pasifleştirip arkaplanını pasif renk yapan ve pasif sembolle etiketleyen method
    private void pasifYap(JButton button) {
        button.setBackground(pasifRenk); // Arkaplan pasif renge döndü.
        button.setText((String) button.getClientProperty("PasifSembol")); // Buton pasif sembolle etiketlendi.
    }

    private void pasifYapTumAktifler() {
        // Eğer önceki bir tıklama varsa, tüm aktif butonları pasif hale getir.
        if (sonTiklananButon != null) {
            pasifYap(sonTiklananButon);
        }
    }

}

