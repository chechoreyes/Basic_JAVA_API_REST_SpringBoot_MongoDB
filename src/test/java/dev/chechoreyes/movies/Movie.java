package dev.chechoreyes.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Document hace referencia a la coleccion de mongoDB que va a buscar/leer
@Document(collection = "movies")
@Data
//@AllArgsConstructor es un decorador que pasa los atributos private como argumentos de la clase
@AllArgsConstructor
//@NoArgsConstructor hace que la clase no tome mas argumentos
@NoArgsConstructor
public class Movie {

    @Id
    private ObjectId id;
    private String imbdId;
    private String title;
    private String releaseDate;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    // private List<Review> reviewIds;

}
