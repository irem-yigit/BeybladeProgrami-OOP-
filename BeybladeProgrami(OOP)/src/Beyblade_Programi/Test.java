package Beyblade_Programi;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){  //Polymorphism kullanarak Beyblade Programı

        System.out.println("Beyblade Programına Hoşgeldiniz....");
        System.out.println("Çıkış için q'ya basın...");
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Hangi Beyblade'i üretmek istiyorsunuz? : ");
            String islem = scan.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor.....");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();

                Beyblade beyblade = fabrika.beybladeUret(islem);  // Burada polymorphism yaptım!!!

                if (beyblade == null){
                    System.out.println("Lütfen geçerli bir Beyblade ismi girin....");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
               /*          Beyblade beyblade = fabrika.beybladeUret(islem);
                 ='in sol tarafinda Beyblade turunden "beyblade" isimli bir referans olusturuyor ve bunu esitligin sag tarafindaki
                 nesneyi gosterecek sekilde esitliyor. Esitligin sag tarafinda ise fabrika nesnesi uzerinden beybladeUret(islem) fonksiyonunu cagiriyor.
                 Bu fonksiyonun gorevi ise kendisine referans olarak hangi beyblade i verirsen o turden bir beyblade uretiyor.
                 Ornegin islem="Dranza" ise Dranza turunden bir nesne uretip onu geri donduruyor. Bu nedenle ilk basta olusturdugumuz referansa,
                 beybladeUret(islem) fonksiyonundan geri donen babylade nesnesini esitliyor. Yani beyblade referansi artik fonksiyondan gelen nesne
                 ne ise onu isaret ediyor. Fonksiyondan gelen nesne (dragon/dranza/draciel/drayge) her ne olursa olsun ayni zamanda beyblade sinifinin
                 alt sinifi oldugu icin yani bunlarin her biri aslinda bir beyblade oldugu icin polymorphisimin ozelligi sayesinde bu esitligi ve bebylade
                 referansina ornegin dragon nesnesini atayabiliyoruz
                 */

                /* void metodlar, değişkenleri akılda tutmazlar sadece ekrana bir şey yazdırmak için kullanılırlar yani biz void olarak tanımlasaydık
                yeni beyblade'ler sadece ekrana bir şekilde yazdırılıcaktı. Ancak biz daha sonra main metodunun içinde, atıyorum Beyblade objelerinin
                 ateş, vb gibi özelliklerini sadece print metodu ile kullanamayız yani direk olarak bir Beyblade objesine ihtiyacımız var.
                 -----------yani void ile ürettiğimiz objeleri başka bir classta ya da methodun için de gerçekte var edememiş oluyoruz sanki bahsi geçen
                  bir obje oluyorlar ama returnle döndürerek elle tutulur gerçek bir obje üretmiş oluyoruz ---------------------------
                 */
