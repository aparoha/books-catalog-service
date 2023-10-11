# Run Books Catalog Service

Go to project root directory

Using maven: mvn spring-boot:run

Using java: java -jar target/books-catalog-service-0.0.1-SNAPSHOT.jar

# Hit API

POST : http://localhost:8080/graphql

Request

    {
    fetchBooks {
    name
    author
    ratings {
    rating
    }
    }
    }

Response

    {
    "data": {
    "fetchBooks": [
    {
    "name": "Anna Karenina",
    "author": "Leo Tolstoy",
    "ratings": [
    {
    "rating": 5
    },
    {
    "rating": 3
    },
    {
    "rating": 3
    }
    ]
    },
    {
    "name": "Madame Bovary",
    "author": "Gustave Flaubert",
    "ratings": []
    },
    {
    "name": "War and Peace",
    "author": "Leo Tolstoy",
    "ratings": [
    {
    "rating": 5
    },
    {
    "rating": 1
    },
    {
    "rating": 1
    }
    ]
    },
    {
    "name": "The Great Gatsby",
    "author": "F. Scott Fitzgerald",
    "ratings": []
    },
    {
    "name": "Lolita",
    "author": "Vladimir Nabokov",
    "ratings": []
    }
    ]
    }
    }

