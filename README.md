# Proje Tanımı
Contract-last yaklaşımı ile soap web servis oluşturuldu.
Contract-last ile önce sınıflar yazılır, sonra CXF kütüphanesi kullanılarak WSDL koddan  üretilir(runtime'da).

### Adım Adım Servisin Yazılması


- Servisin interface oluşturulur.(ISearchComputer)
- Request Responselar oluşturulur.
- Interface'in implementasyonu yapılır.(SearchComputerImpl)
- Servise dışardan ulaşıması için endpoint tanımı yapılır. applicationContext.xml dosyasında bu tanım yapılır.
- web.xml dosyasında servlet oluşturulur. Gelen istekler, servlet ile endpointe aktarılır.

### Servislerin Listelenmesi

Tarayıcıda **http://localhost:8080/services** linki aratıldığında servisler aşağıdaki gibi listelenir.Localde yapılan denemelerde serverın alrındda bulunan server.xml
dosyasında **path="/"** olduğunu kontrol ediniz. Aksihalde pathdeki adreside url'e eklemelisiniz.


![Github ](services.png)

