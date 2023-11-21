import java.util.Objects;

public class Book {
    public String title;
    public String author;
    public int numberOfPages;

    public Book(String title, String author, int numberOfPages){
        if(numberOfPages < 0) this.numberOfPages = 1;
        else this.numberOfPages = numberOfPages;

        if(!title.isEmpty() && title != null) this.title = title;
        else this.title = "";

        if(!author.isEmpty() && author != null) this.author = title;
        else this.author = "";
    }

    @Override
    public String toString(){
        return "Book: " + this.title + " by " + this.author + ", Pages: " + this.numberOfPages + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Book b) return this.title.equals(b.title);
        return false;
    }
}
