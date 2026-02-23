package DesignPrinciple.SOLID;

public class DIP {
    public static void main(String[] args) {
        User u1 = new User(new SQL());
        u1.store("Tanya");
        User u2 = new User(new MongoDb());
        u2.store("Maheshwari");
    }
}

abstract class Database {
    public abstract void save(String data);
}

class User {
    private Database db;

    User(Database db) {
        this.db = db;
    }

    public void store(String data) {
        db.save(data);
    }
}

class MongoDb extends Database {
    @Override
    public void save(String data) {
        System.out.println(data + " is stored in mongo db");

    }
}

class SQL extends Database {
    @Override
    public void save(String data) {
        System.out.println(data + " is stored in SQL");
    }

}