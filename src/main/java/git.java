public class git {
    public static void main(String[] args) {
        // git init komutu localimizde çalışmamızı sağlar
        // git init komutu o projede tek geçerli sayılır
        // localde çalışmak istiyorsanız çalışacağınız projeyi localinize almanız gerekir
        // git status komutu projenin durumunu gösterir
        // git add . komutu projemizi veya clasımızı geçici alana gönderir
        // git add . komutundan kullanmadan önce clas isimimiz kırmızı renkte gösterir gönderdikten sonra yeşile döner
        // git commit -m"v1" komutu ile geçici alandan repositorye göndeririz.
        // cls komutu ile terminalı temizleyebiliriz .
        // git log --oneline komutu ile versiyonu görüntüyebliriz
        // git show komutu ile versiyon bilgilerini görüntüliyebiliriz.
        // git te ana komutlar git init ,git add . , git commit - m"versiyon metni"
        //yardımcı komutlar  git status ,git show ,git log

        int a=8;
        int b=5;
        int d=3;
        System.out.println(a+b);
        System.out.println("versiyon oluşturuldu");
        System.out.println(a*b);
        System.out.println("versiyon 2 oluşturuldu ");
        // version 3
        // git restore -- staged komutu ile gecici bölgeye gönderdiğimiz versiyonu geri alır
        System.out.println(a/b);
        //git restore . komutu ile versiyonun son halinin alır
        // örneğin v1,v2,v3,v4 oluşturduk v4 doğru düzgün çalışmıyor bunun çözümü olarak v3 dönüp v5 olarak yayınlayıp
        //v5 olarak kullanıcı kullanır
        //versiyon 4
        System.out.println("olmaması gereken kodlar");



    }
}
