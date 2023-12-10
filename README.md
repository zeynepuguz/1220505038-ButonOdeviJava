# Buton Tasarımı Ve GraphQL



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



**GraphQL Şeması Hakkında**


GraphQL, API istemcilerine tam olarak istedikleri verileri veren uygulama programlama arayüzlerine yönelik
bir sorgu dili ve sunucu taraflı çalışma zamanıdır. Geliştiricilerin tek bir API çağrısıyla birden fazla veri
kaynağından veri getirme isteğinde bulunmasına olanak tanır. API'leri uç noktalara göre değil,
sundukları verilere göre düzenlenir. Geliştiriciler tek bir uç noktadan verilerinin tüm özelliklerine
erişebilir. GraphQL'de türler, uygulamaların yalnızca neyin mümkün olduğunu sormasını ve hataların
açık ve kullanışlı olmasını sağlamak için kullanılır. API'leri hızlı, esnek ve geliştirici dostu hale getirmek
için tasarlanmıştır. API bakımcılarına mevcut sorguları etkilemeden alan ekleme veya çıkarma
esnekliği sağlar. Geliştiriciler API'leri istedikleri zamanda ve istedikleri şekilde oluşturabilir ve
GraphQL spesifikasyonu, API'lerin istemciler için öngörülebilir şekilde davranmasına olanak sağlar.
Ayrıca GraphQL adı verilen entegre bir geliştirme ortamına da dağıtılabilir. Çoğu uygulamanın
GraphQL'de olduğu gibi resmileştirilmiş bir istemci-sunucu sözleşmesi yoktur. Ürün geliştiricileri,
ihtiyaç duydukları verileri elde edebilmek için özel kod yazarak sunucu özelliklerine birden çok uç
nokta aracılığıyla erişir. Sunucular prosedürleri tanımlar ve verileri döndürür. Bu yaklaşım bizlere
basitlik sunarken, uygulama karmaşıklığı daha da arttıkça, sistemler yaşlandıkça veya her iki durumda
da giderek daha az verimli hale gelir. GraphQL'deki bir işlem okuma veya yazma olabilir. Değerleri
okumak veya getirmek için bir GraphQL sorgusu kullanılırken, değerleri yazmak veya göndermek için
bir mutasyon kullanılır. Verinin nereden geldiği hiçbir fark yaratmaz. Bir veritabanından, bir mikro
hizmetten, hatta arka uçtaki bir RESTful API'den gelebilir. GraphQL, GraphQL kullanıcı arayüzünde
dokümantasyon oluşturmak ve ipuçları sağlamak amacıyla veritabanınızdaki tür sistemini ve veri
yapılarını sorgulamanın bir yolu olan bir iç gözlem sorgulama sistemi ile birlikte gelir. Eğer iç gözlem
kelimesine aşina değilseniz, bu, içe bakmak ve kendi durumunuzu incelemek anlamına gelir.
Genellikle bir GraphQL sunucusu aracılığıyla HTTP üzerinden sunulur. GraphQL ile iletişim kurmanın
WebSockets gibi başka yolları da vardır, ancak HTTP büyük ölçüde en popüler seçimdir. Aynı HTTP
çağrısını, HTTP'yi desteklediği sürece herhangi bir dili veya çerçeveyi kullanarak yapabilirsiniz.
GraphQL' in avantajlarını sayarsak şunlar karşımıza çıkar: Haftalar süren projeler saatler içinde
tamamlanabilmesi, sorguların öngörülebilir sonuçlar döndürmesi, sunucu verileri kontrol etmediği
için uygulamaların hızlı ve kararlı olması, verilerin fazla ve az getirilmesi ortadan kaldırılır. Ağ ve
bellek kullanımı azalır. Otomasyonla tasarruflar gerçekten artmaya başlar. Ürün geliştiricileri, tam
olarak ihtiyaç duydukları verileri, düşünme ve çalışma biçimlerine göre daha doğal olan, bildirime
dayalı, hiyerarşik bir şekilde sorgulayabilir. Herhangi bir özel uygulama mimarisi gerektirmez. Mevcut
bir REST API' sine eklenebilir ve mevcut API yönetim araçlarıyla uyumludur. Dezavantajı ise veri
sorgulama çabasının büyük bir kısmını sunucuya aktarır ve bu da sunucu geliştiricileri için işleri
karmaşık hale getirir. Genel sürecin, yalnızca sağlanan RESTful sorgular koleksiyonundan seçim
yapmaktan daha karmaşık olmasıdır. Burada kullanıcıların GraphQL sözdizimini öğrenmesi, şema,
türler ve iç gözlem gibi kavramları anlamasının yanı sıra tamamen yeni bir araç seti öğrenmesi
gerekiyor ancak GraphQL, API geliştiricileri için de daha karmaşıktır; GraphQL uygulamaları, güvenlik
açıkları için yeni olasılıklar açar. GraphQL sorgu dilinin kullanıldığı alanlar ise şunlardır: Web
Uygulamaları, mikroservis mimarileri, e-ticaret siteleri, veri entegrasyonu, sosyal medya platformları,
oyun geliştirme, mobil uygulamalar gibi daha sayamadığımız birçok alanda kullanılmaktadır.
 

 
