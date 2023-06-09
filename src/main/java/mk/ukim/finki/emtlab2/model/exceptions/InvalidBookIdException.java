package mk.ukim.finki.emtlab2.model.exceptions;

public class InvalidBookIdException extends RuntimeException{
    public InvalidBookIdException(Long id){
        super(String.format("Book with id: %d was not found.",id));
    }
}
