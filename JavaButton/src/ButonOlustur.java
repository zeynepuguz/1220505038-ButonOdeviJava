import javax.swing.*;
import java.awt.*;

public class ButonOlustur {
    private final Color pasifRenk = Color.GRAY; // Pasif herhangi bir butonun rengi
    public JButton butonOlustur() {
        //JButton türünde bir buton oluşturup arkaplanını pasif renk olarak ayarlamasını sağladım.
        JButton buton = new JButton(); /* JButton türünde bir buton değişkeni tanımladım ve butonPaneli sınıfından çağırıldığında her dizi elemanının bir buton değişkenine atanması
        gerektiğini belirtmiş oldum.*/
        buton.setBackground(pasifRenk); // Buton rengini pasif olarak vererek de üzerine hiç basılmamış bir butonun pasif renkte olması gerektiğini belirtmiş oldum.

        buton.putClientProperty("GraphQLSemaAdresi", "https://ornek.com/graphql");//GraphQL Şeması için böyle bir örnek adres verdim.
        buton.putClientProperty("AktifSembol", "A"); // Buton aktif olduğunda görünecek sembol
        buton.putClientProperty("PasifSembol", "P"); // Buton pasif olduğunda görünecek sembol

        return buton;


    }
}
