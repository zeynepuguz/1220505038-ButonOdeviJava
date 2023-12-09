# 1220505038


## Buton Tasarımı Ve GraphQL



**Projenin Amacı**


Proje, 4x4 tipinde oluşturulan bir buton panelindeki butonların aktiflik pasiflik durumlarına göre değişimlerini sağlıyor.



**Nasıl Kullanılır**


Programı çalıştırmak için, kodun main dosyasını derleyin ve oluşan programı çalıştırın. Program çalıştığında ekranda bir buton paneli açılacak. Açılan panelde butonların üzerlerine tıklayarak aktiflik pasiflik durumlarını gözlemleyebilirsiniz. 



 **Nasıl Çalışır**

 
 Öncelikle JFrame tipinde butonları içerecek olan bir panel oluşturulur. JButton türünde 4x4 matris tipinde oluşturulan butonlar tek tek panele eklenir.

 Her buton başlangıçta pasif durumdadır. Butonlar üzerlerine tıklandığında aktif duruma geçerler ancak sadece bir buton aktif olabilir. Bu durumda bir butona tıklandığında o aktif olur ve aktif sembolüyle etiketlenir son aşamada sonTiklananButon değişkenine atanarak başka bir butona tıklandığında o sonTiklananButon olarak atanan buton pasifYap methoduyla pasife çevrilip pasif sembolüyle etiketlenir aktif buton da aktif renkte ve aktif sembolüyle etiketlenir. Her başka butona tıklandıkça bu döngü bu şekilde devam eder. 

 Sonuç olarak bir buton aktifken başka bir buton aktif olamaz.

 Ayrıca her buton çalıştırıldığında GraphQL şeması simülasyon olarak örnek boş bir adreste çalıştırılır ve bunun bilgisini ekrana yazdırır.



 **Kullanılan Yapılar**


Programda butonları içerecek olan panelin oluşması için Javada tanımlı JFrame sınıfını miras alan yapı:
 
 `ButonPaneli extends JFrame`


 Programda 4x4 matris tipindeki butonları oluşturması için gerekli yapı:

 `private JButton[][] butonlar;`


 Programa bir arayüz uygulayıp herhangi bir butona tıklandığında gerçekleşen olayları kontrol etmesi için tanımlı yapı:

 `ButonTiklandiginda implements ActionListener`
 `actionPerformed(ActionEvent e)`


 Programda Java Swing GUI oluşturması için main sınıfında tanımlı yapı:

 `SwingUtilities.invokeLater`



 **Kullanılan Dil ve Araçlar**


Bu program Java dilinde hazırlanmıştır. Ayrıca swing için gerekli paketler de sonradan projeye daahil edilmiştir.
 

 
