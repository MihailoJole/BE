package mihailo.ilija.njtprojekat.controller;

import mihailo.ilija.njtprojekat.exceptions.MyEntityAlreadyExist;
import mihailo.ilija.njtprojekat.exceptions.MyEntityDoesntExist;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class RestErrorHandler {

    @ExceptionHandler(MyEntityDoesntExist.class)
    @ResponseBody
    public ResponseEntity notFound(MyEntityDoesntExist ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }

    @ExceptionHandler(MyEntityAlreadyExist.class)
    @ResponseBody
    public ResponseEntity alreadyExist(MyEntityAlreadyExist ex) {
        return ResponseEntity.status(409).body(ex.getMessage());
    }


}
