package Application.Service;

import Application.Model.Author;
import Application.DAO.AuthorDAO;

import java.util.List;


public class AuthorService {
    // state
    private AuthorDAO authorDAO;
    
    // constructors
    public AuthorService(){
        authorDAO = new AuthorDAO();
    }
    
    public AuthorService(AuthorDAO authorDAO){
        this.authorDAO = authorDAO;
    }
    // get all authors
    public List<Author> getAllAuthors() {
        return authorDAO.getAllAuthors();
    }
    
    // add author
    public Author addAuthor(Author author) {
        return authorDAO.insertAuthor(author);
    }
}
