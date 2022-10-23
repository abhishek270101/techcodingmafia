package database;
import tech.codingclub.tables.Coders;
//import tech.codingclub.entity.Coders;
import entity.coders;
public class TestCodersTable {

    public static void main(String[] args) {

        coders akshat = new coders("Abhishek", 21L );

        //Insert this object into DB !

//           < ENTITY CLASS>
      //  new GenericDB<coders>().addRow(Coders.CODERS, akshat);
       // new GenericDB<Coders>().addRow(Coders.CODERS, akshat);
        //CRUD Operations create,read,update,delete
    }
}
