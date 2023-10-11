package com.adp.bookscatalogservice.model;

public record Rating(Integer id, Integer bookId, Integer rating, String comment, String user) {
}
