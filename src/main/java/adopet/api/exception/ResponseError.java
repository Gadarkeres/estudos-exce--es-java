package adopet.api.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public record ResponseError(String message, HttpStatus status, LocalDateTime timestamp) {

}
