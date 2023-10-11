package com.adp.bookscatalogservice.service;

import com.adp.bookscatalogservice.model.Book;
import com.adp.bookscatalogservice.model.Rating;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BooksCatalogService {

    private final Map<Integer, Book> booksRepository = new HashMap<>();
    private final Map<Integer, Rating> ratingsRepository = new HashMap<>();

    public BooksCatalogService() {
        booksRepository.put(1, new Book(1,"Anna Karenina","Leo Tolstoy"));
        booksRepository.put(2, new Book(2,"Madame Bovary","Gustave Flaubert"));
        booksRepository.put(3, new Book(3,"War and Peace","Leo Tolstoy"));
        booksRepository.put(4, new Book(4,"The Great Gatsby","F. Scott Fitzgerald"));
        booksRepository.put(5, new Book(5,"Lolita","Vladimir Nabokov"));

        ratingsRepository.put(1, new Rating(1,1,5,  "Awesome", "Sam"));
        ratingsRepository.put(2, new Rating(2,1,3,  "Great Story", "Daniel"));
        ratingsRepository.put(3, new Rating(3,1,3,  "Nice", "Jack"));

        ratingsRepository.put(4, new Rating(4,3,5,  "Super", "Thomas"));
        ratingsRepository.put(5, new Rating(5,3,1,  "OK", "Kent"));
        ratingsRepository.put(6, new Rating(6,3,1,  "Poor", "Peter"));
    }

    public List<Rating> fetchRatings(Book book) {
        return ratingsRepository
                .values().
                stream()
                .filter(rating -> rating.bookId().equals(book.id()))
                .toList();
    }

    public List<Book> fetchBooks() {
        return booksRepository.values().stream().toList();
    }
}
