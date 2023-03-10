package is.hi.ftr2.hbv202g.ass8;

import java.time.LocalDate;

public class Lending {
    private LocalDate dueDate;
    public Book book; 
    public User user;

    public Lending(Book book, User user) {
        this.book = book;
        this.user = user;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
