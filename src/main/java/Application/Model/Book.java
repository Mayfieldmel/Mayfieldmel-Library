package Application.Model;

public class Book {
    // state
    int isbn;
    int author_id;
    String title;
    int copies_available;

    //  constructors
    public Book(){
    }

    public Book(int isbn, int author_id, String title, int copies_available) {
        this.isbn = isbn;
        this.author_id = author_id;
        this.title = title;
        this.copies_available = copies_available;
    }

    // getters
    public int getIsbn() {
        return isbn;
    }
    
    public int getAuthor_id() {
        return author_id;
    }
    
    public String getTitle() {
        return title;
    }

    public int getCopies_available() {
        return copies_available;
    }

    // setters
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCopies_available(int copies_available) {
        this.copies_available = copies_available;
    }
   
    // override inherited methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn && author_id == book.author_id && title.equals(book.title)
                && copies_available == book.copies_available;
    }
  
    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author_id=" + author_id +
                ", title=" + title +
                ", copies_available=" + copies_available +
                '}';
    }
}
