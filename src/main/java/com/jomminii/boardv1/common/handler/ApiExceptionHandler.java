package com.jomminii.boardv1.common.handler;

import com.jomminii.boardv1.common.ResultDTO;
import com.jomminii.boardv1.common.ServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(ServiceException.class)
    public ResultDTO<Object> handleServiceException(ServiceException exception) {
        return ResultDTO.of(exception.getResultCode(), exception.getMessage());}

    @ExceptionHandler(Exception.class)
    public ResultDTO<Object> handleException(Exception exception) {
        return ResultDTO.ofFail(exception.getMessage());
    }
}
