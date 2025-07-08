package hello.exception.exhandler;


import hello.exception.api.ApiExceptionController;
import hello.exception.exception.UserException;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.lang.reflect.Member;

@Data
@AllArgsConstructor
public class ErrorResult {
    private String code;
    private String message;


}
