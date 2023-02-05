import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();

        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanmak istediğiniz database servisinin rakamını seçin :\n" +
                "0-Çıkış\n" +
                "1-Oracle\n" +
                "2-Sql\n" +
                "3-MySql");
        int tercih = scan.nextInt();
        if (tercih==0){
            System.out.println("Sistemden çıkıldı.");
        }else if (tercih==1){
           customerManager.databaseManager= new OracleDatabaseManager();
           customerManager.getCustomers();
        }else if(tercih==2){
            customerManager.databaseManager = new SqlServerDatabaseManager();
            customerManager.getCustomers();
        }else if (tercih ==3){
            customerManager.databaseManager= new MySqlDatabaseManager();
            customerManager.getCustomers();
        }else{
            System.out.println("Hatalı tuşlama yaptınız.");
        }
    }
}
