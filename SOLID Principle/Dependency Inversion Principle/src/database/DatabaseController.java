package database;

// the high level module
public class DatabaseController {
    // we program to an interface - so we can achieve loosely coupled architecture
    private Database db;

//    public database.DatabaseController() {
//        //tight binding when we program to a class (Instead of an interface)
//
//        db = new database.MySqlDatabase();
//        db.connect();
//        db.disconnect();
//    }

    public DatabaseController(Database db) {
        this.db = db;
    }
    public void connect(){
    this.db.connect();
    }

    public void disconnect(){
        this.db.disconnect();
    }
}
