package com.jomminii.boardv1.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class ServiceException extends RuntimeException {

    private final ResultCode resultCode;
    private final String message;

    public static void throwServiceException(final ResultCode resultCode, final ErrorMessages errorMessages, final Object... args) {
        throw new ServiceException(resultCode, errorMessages, args);
    }

    private ServiceException(final ResultCode resultCode, final ErrorMessages errorMessages, final Object... args) {
        this.resultCode = resultCode;
        this.message = errorMessages.getMessage(args);
    }
}
