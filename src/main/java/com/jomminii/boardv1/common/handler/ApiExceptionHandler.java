package com.jomminii.boardv1.common.handler;

import com.jomminii.boardv1.common.ResultDTO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResultDTO<Object> handleException(Exception exception) {
        return ResultDTO.ofFail(exception.getMessage());
    }
}
