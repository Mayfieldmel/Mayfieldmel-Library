package Application.Service;

import Application.DAO.BookDAO;
import Application.Model.Book;

import java.util.List;
import java.util.Objects;


public class BookService {
    // state
    public BookDAO bookDAO;

    // constructors
    public BookService(){
        bookDAO = new BookDAO();
    }
    
    public BookService(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }
 
    // get all books
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }
 
    //  add book
    public Book addBook(Book book) {
        Book bookId = bookDAO.getBookByIsbn(book.getIsbn());
      
        if (Objects.isNull(bookId)) {
            return bookDAO.insertBook(book);
        } else {
        return null;
    }
    }
   
    // get all available books
    public List<Book> getAllAvailableBooks() {
        return bookDAO.getBooksWithBookCountOverZero();
    }

}
