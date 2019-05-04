# Proje Tanımı
Contract-last yaklaşımı ile soap web servis oluşturuldu.
Contract-last ile önce sınıflar yazılır, sonra CXF kütüphanesi kullanılarak WSDL koddan  üretilir(runtime'da).

### Servislerin Listelenmesi

Tarayıcıda **http://localhost:8080/services** linki aratıldığında servisler aşağıdaki gibi listelenir.Localde yapılan denemelerde serverın alrındda bulunan server.xml
dosyasında **path="/"** olduğunu kontrol ediniz. Aksihalde pathdeki adreside url'e eklemelisiniz.


![Github ](services.png)
