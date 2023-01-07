import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, passWord;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1000000;
        int select;

        while (right > 0) {
            System.out.print(" Kullanıcı Adı : ");
            userName = input.nextLine();
            System.out.print(" Şifreniz : ");
            passWord = input.nextLine();

            if (userName.equals("Ömer Faruk Şanlı") && passWord.equals("123123")) {
                System.out.println("ŞANLI BANKASINA HOŞ GELDİNİZ :) ");

                do {
                    System.out.println("1.Para Çekme\n" + "2.Para Yatırma\n" + "3.Bakiye Sorgula\n" + "4.Çıkış");
                    System.out.print("Yapmak istediğiniz İşlemi Seçin : ");
                    select = input.nextInt();

                    switch (select){
                        case 1:{
                            System.out.print("Çekmek istediğiniz tutarı giriniz : ");
                            int price = input.nextInt();
                            if(price>balance){
                                System.out.println("Yetersiz Bakiye : ");

                            }else {
                                balance -= price;
                            }break;
                        } case 2:{
                            System.out.println("Yatırmak istediğiniz tutarı giriniz : ");
                            int price = input.nextInt();
                            balance += price;
                        }break;
                        case 3: {
                            System.out.println(" Hesap Bakiyeniz :  " + balance);
                            break;
                        }
                        default:
                            System.out.println("");
                            break;
                    }

                }while (select != 4);
                System.out.println("Görüşmek Üzere Ömer Bey.");
                break;
            }else {
                System.out.println("Hatalı kullanıcı bilgisi ! Tekrar Deneyiniz !");
                right--;
                if (right==0){
                    System.out.println(" Hesabınız Bloke Olmuştur .");
                }else {
                    System.out.println("Giriş Hakkınız : " + right);
                }
            }
        }


    }
}