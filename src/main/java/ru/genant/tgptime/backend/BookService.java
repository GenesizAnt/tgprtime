package ru.genant.tgptime.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Service
//@RequiredArgsConstructor
public class BookService implements CrudListener<Book> {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Book> findAll() {
        return repository.findAll();
    }

    @Override
    public Book add(Book book) {
        return repository.save(book);
    }

    @Override
    public Book update(Book book) {
        return repository.save(book);
    }

    @Override
    public void delete(Book book) {
        repository.delete(book);
    }
}
