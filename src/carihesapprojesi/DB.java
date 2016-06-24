package carihesapprojesi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DB {
//    ?useUnicode=true&characterEncoding=utf-8
//    ?useUnicode=true&characterEncoding=latin1
//    ?useUnicode=true&characterEncoding=utf-8&collationsEncoding=utf8_turkish_ci
    
   private String dbName="carihesap?useUnicode=true&characterEncoding=utf-8";
   private String dbUsername="root";
   private String dbPass="";
   private String driver="com.mysql.jdbc.Driver";
   private String url="jdbc:mysql://localhost/";
   Connection conn=null;
   Statement st=null;

    public DB() {
    }
   public DB(String dbName){
       this.dbName=dbName;
       
   }
   //Bağlan metodu ...
   public Statement baglan(){
       try {
           Class.forName(driver);
           conn=DriverManager.getConnection(url+dbName, dbUsername, dbPass);
           st = conn.createStatement();
       } catch (Exception e) {
           System.err.println("Bağlantı Hatası ... : "+e);
       }
       return st;
   }
}
