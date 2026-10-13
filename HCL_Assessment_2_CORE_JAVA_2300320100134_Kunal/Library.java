//Parent class 
abstract class LibraryItems{
    private int id;
    private String title;
    private int year;
    private boolean available;

    LibraryItems(int id, String title, int year, boolean available){
        this.id = id;
        this.title = title;
        this.year = year;
        this.available = available;
    }
    abstract double Latefee( int daysLate);

    public void setId()
}

class Book extends LibraryItems{
    String author;
    int numPages;

    Book(String title, int id ){
        super(id, title, 0, true);
    }

    double Latefee(int daysLate){
        return daysLate * 0.25;
        }
}

class Magazine extends LibraryItems{
    String publisher;
    int issueNumber;

    Magazine(String title, int id){
        super(id, title, 0, true);
    }

    double Latefee(int daysLate){
        return daysLate * 0.50;
    }
}

class DVD extends LibraryItems{
    String director;
    int duration;

    DVD(String title, int id){
        super(id, title, 0, true);
    }

    double Latefee(int daysLate){
        return daysLate * 1.00;
    }
}
interface Borrowable{
    boolean isAvailable();
    void borrow();
    void giveback();
}

public class Library{
    public static void main(String []args){
            LibraryItem item=new LibraryItem();
    }
}

