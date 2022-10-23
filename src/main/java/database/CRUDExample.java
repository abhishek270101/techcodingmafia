package database;

import tech.codingclub.tables.Coders;

import java.util.Date;
import java.util.List;
import entity.coders;
public class CRUDExample {
    public static void readTableCoders()
    {
        List<coders> rows=(List<coders>) GenericDB.getRows(Coders.CODERS, coders.class,null,null);
        for(coders row:rows)
        {
            System.out.println("Row :"+row.getName()+" "+row.getAge());
        }
    }
    public static void main(String[] args) {
        System.out.println("This is Abhishek");
        System.out.println("Reading rows at"+new Date().toString());
        //reading file
       // Coders s=new GenericDB<Coders>().getRow(Coders.CODERS, Coders.class,null);
        //reading all rows together
        //readTableCoders();
       //update
       // new GenericDB<String>().updateColumn(Coders.CODERS.NAME, "Coding Mafia", Coders.CODERS, Coders.CODERS.NAME.eq("Abhishek"));
        readTableCoders();
        //delete
        coders akshat = new coders("Spammer", 50L );
        //new GenericDB<Coders>().addRow(Coders.CODERS, akshat);

    }
}
