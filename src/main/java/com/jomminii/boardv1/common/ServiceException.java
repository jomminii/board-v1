package com.jomminii.boardv1.common;

import com.jomminii.boardv1.common.ResultCode.Common;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
public class ServiceException extends RuntimeException {

    private final ResultCode resultCode;
    private final String message;

    public static void throwServiceException(final ResultCode resultCode, final ErrorMessages errorMessages, final String... args) {
        throw new ServiceException(resultCode, errorMessages, args);
    }

    public static void throwServiceException(final ErrorMessages errorMessages, final String... args) {
        throw new ServiceException(Common.FAIL, errorMessages, args);
    }
    private ServiceException(final ResultCode resultCode, final ErrorMessages errorMessages, final String... args) {
        this.resultCode = resultCode;
        this.message = errorMessages.getMessage(args);
    }
}
