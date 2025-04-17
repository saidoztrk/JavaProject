package notUugulaması;

import java.util.Scanner;

public class NotUygulamasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ogrenciSayisi;

        System.out.print("Öğrenci sayısını giriniz: ");
        ogrenciSayisi = scanner.nextInt();

        if (ogrenciSayisi > 0) {
            int[] OgrenciNo = new int[ogrenciSayisi];
            String[] OgrenciAd = new String[ogrenciSayisi];
            double[] OgrenciVizeNotu = new double[ogrenciSayisi];
            double[] OgrenciFinalNotu = new double[ogrenciSayisi];
            double[] OgrenciDonemNotu = new double[ogrenciSayisi];
            boolean dongu = true;

            while (dongu) {
                System.out.println("Girilen öğrenci sayısı: " + ogrenciSayisi);
                System.out.println("\n\nAna Menüye yönlendiriliyor...\n");
                System.out.println("__________________________________________________________________");
                System.out.println("|               Ana Menüye Hoş geldiniz                          |");
                System.out.println("|         Lütfen Yapmak İstediğiniz İşlemi Seçin                 |");
                System.out.println("|________________________________________________________________|");
                System.out.println("|          1)  Öğrenci Genel Bilgilerini Ekleme                  |");
                System.out.println("|________________________________________________________________|");
                System.out.println("|          2) Girilmiş öğrenci bilgilerini listeleme             |");
                System.out.println("|________________________________________________________________|");
                System.out.println("|          3) Öğrencilerin not ortalamalarını listeleme          |");
                System.out.println("|________________________________________________________________|");
                System.out.println("| 4) Final sınavı 60 altında olan öğrencilerin bilgilerini listele|");
                System.out.println("|________________________________________________________________|");
                System.out.println("| 5) Dönem sonu notu sınıf ortalamasının üzerinde olan öğrenciler|");
                System.out.println("|________________________________________________________________|");
                System.out.println("|           6) En düşük vize notu                                |");
                System.out.println("|________________________________________________________________|");
                System.out.println("|           7) En yüksek final notu                              |");
                System.out.println("|________________________________________________________________|");
                System.out.println("|           8) Çıkış                                             |");
                System.out.println("|________________________________________________________________|");

                System.out.println("Seçim Yapınız");
                int secim = scanner.nextInt();
                System.out.println("Yapmak istediğiniz işlem " + secim + " numaralı işlem");

                switch (secim) {
                    case 1:
                        for (int sayac = 0; sayac < ogrenciSayisi; sayac++) {
                            System.out.println("\n" + (sayac + 1) + ". öğrenci için bilgileri giriniz\n");

                            System.out.println("Öğrenci kimlik bilgisini giriniz:");
                            OgrenciNo[sayac] = scanner.nextInt();

                            scanner.nextLine();

                            System.out.println("Öğrenci adını giriniz:");
                            OgrenciAd[sayac] = scanner.nextLine();

                            System.out.println("Öğrenci vize notunu giriniz:");
                            double VizeNot = scanner.nextDouble();

                            if (VizeNot < 0) {
                                System.out.println("Vize notu sıfırdan küçük bir değer girilemez, vize notu sıfır olarak kabul edildi.");
                                OgrenciVizeNotu[sayac] = 0;
                            } else if (VizeNot > 100) {
                                System.out.println("Vize notu 100'den büyük bir değer girilemez, vize notu 100 olarak kabul edildi.");
                                OgrenciVizeNotu[sayac] = 100;
                            } else {
                                OgrenciVizeNotu[sayac] = VizeNot;
                            }

                            System.out.println("Öğrenci final notunu giriniz:");
                            double FinalNot = scanner.nextDouble();

                            if (FinalNot < 0) {
                                System.out.println("Final notu sıfırdan küçük bir değer girilemez, Final notu sıfır olarak kabul edildi.");
                                OgrenciFinalNotu[sayac] = 0;
                            } else if (FinalNot > 100) {
                                System.out.println("Final notu 100'den büyük bir değer girilemez, Final notu 100 olarak kabul edildi.");
                                OgrenciFinalNotu[sayac] = 100;
                            } else {
                                OgrenciFinalNotu[sayac] = FinalNot;
                            }
                        }
                        break;

                    case 2:
                        System.out.println("\nÖğrenci bilgileriniz listeleniyor...\n");
                        if (OgrenciAd[0] == null) {
                            System.out.println("Lütfen öğrenci bilgilerini ekleyip tekrar listelemeyi deneyin \n ");
                        } else {
                            for (int sayac = 0; sayac < ogrenciSayisi; sayac++) {
                                OgrenciDonemNotu[sayac] = (OgrenciVizeNotu[sayac] * 0.4 + OgrenciFinalNotu[sayac] * 0.6);
                                System.out.println((sayac + 1) + ".Öğrenci / Kimlik: " + OgrenciNo[sayac] + " / Ad: " + OgrenciAd[sayac] + " / Ara Sınav Notu: " + OgrenciVizeNotu[sayac] + " / Final Notu: " + OgrenciFinalNotu[sayac] + " / Dönem Sonu Notu: " + OgrenciDonemNotu[sayac] + "\n");
                            }
                        }
                        break;

                    case 3:
                        System.out.println("\nÖğrenci not ortalamaları listeleniyor...\n");
                        if (OgrenciAd[0] == null) {
                            System.out.println("Lütfen öğrenci bilgilerini ekleyip tekrar listelemeyi deneyin \n ");
                        } else {
                            for (int sayac = 0; sayac < ogrenciSayisi; sayac++) {
                                OgrenciDonemNotu[sayac] = (OgrenciVizeNotu[sayac] * 0.4 + OgrenciFinalNotu[sayac] * 0.6);
                                System.out.println((sayac + 1) + ". Öğrenci: " + OgrenciAd[sayac] + " / Dönem sonu notu: " + OgrenciDonemNotu[sayac]);
                            }
                        }
                        break;

                    case 4:
                        if (OgrenciAd[0] == null) {
                            System.out.println("\nLütfen final sınav notu 60 altında olanları görüntüleyebilmek için ana menüden 1'e basarak öğrenci bilgilerini ekleyiniz");
                        } else {
                            for (int sayac = 0; sayac < ogrenciSayisi; sayac++) {
                                if (OgrenciFinalNotu[sayac] < 60) {
                                    System.out.println((sayac + 1) + ". Öğrenci / Kimlik: " + OgrenciNo[sayac] + " / Ad: " + OgrenciAd[sayac] + " / Vize Notu: " + OgrenciVizeNotu[sayac] + " / Final Notu: " + OgrenciFinalNotu[sayac]);
                                }
                            }
                        }
                        break;

                    case 5:
                        if (OgrenciAd[0] == null) {
                            System.out.println("\nLütfen öğrenci bilgilerini ekleyiniz.");
                        } else {
                            double toplam = 0;
                            for (int i = 0; i < ogrenciSayisi; i++) {
                                OgrenciDonemNotu[i] = (OgrenciVizeNotu[i] * 0.4 + OgrenciFinalNotu[i] * 0.6);
                                toplam += OgrenciDonemNotu[i];
                            }
                            double ortalama = toplam / ogrenciSayisi;
                            System.out.println("\nSınıf ortalaması: " + ortalama);
                            System.out.println("Ortalamanın üstünde not alan öğrenciler:");
                            for (int i = 0; i < ogrenciSayisi; i++) {
                                if (OgrenciDonemNotu[i] > ortalama) {
                                    System.out.println("Öğrenci No: " + OgrenciNo[i] + " / Ad: " + OgrenciAd[i] + " / Dönem Sonu Notu: " + OgrenciDonemNotu[i]);
                                }
                            }
                        }
                        break;

                    case 6:
                        if (OgrenciAd[0] == null) {
                            System.out.println("\nLütfen öğrenci bilgilerini ekleyiniz.");
                        } else {
                            double EnDusukVizeNotu = OgrenciVizeNotu[0];
                            for (int i = 1; i < ogrenciSayisi; i++) {
                                if (OgrenciVizeNotu[i] < EnDusukVizeNotu) {
                                    EnDusukVizeNotu = OgrenciVizeNotu[i];
                                }
                            }
                            System.out.println("En düşük vize notu: " + EnDusukVizeNotu);
                        }
                        break;

                    case 7:
                        if (OgrenciAd[0] == null) {
                            System.out.println("\nLütfen öğrenci bilgilerini ekleyiniz.");
                        } else {
                            double EnYuksekFinalNotu = OgrenciFinalNotu[0];
                            for (int i = 1; i < ogrenciSayisi; i++) {
                                if (OgrenciFinalNotu[i] > EnYuksekFinalNotu) {
                                    EnYuksekFinalNotu = OgrenciFinalNotu[i];
                                }
                            }
                            System.out.println("En yüksek final notu: " + EnYuksekFinalNotu);
                        }
                        break;

                    case 8:
                        System.out.println("Programdan çıkılıyor...");
                        dongu = false;
                        break;

                    default:
                        System.out.println("Geçersiz bir seçim yaptınız, lütfen tekrar deneyin.");
                        break;
                }
            }

            scanner.close();
        } else {
            System.out.println("Geçersiz öğrenci sayısı girdiniz. Lütfen programı tekrar başlatın ve geçerli bir sayı girin.");
        }
    }
}
