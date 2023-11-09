public class Book {
    public String title;
    public String author;
    public int numberOfPages;

    public Book(String title, String author, int numberOfPages){
        if(numberOfPages < 0) this.numberOfPages = 1;
        else this.numberOfPages = numberOfPages;

        if(title != null && title != "" && author != null && author != ""){
            this.title = title;
            this.author = author;
        }else{
            this.title = "";
            this.author = "";
        }
    }

    @Override
    public String toString(){
        return "Book: " + this.title + " by " + this.author + ", Pages: " + this.numberOfPages + ".";
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Book o){
            if(this.title.equals(o.title) && this.author.equals(o.author) && this.numberOfPages == o.numberOfPages) {
                return true;
            }
        }
        return false;
    }
}
