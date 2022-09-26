package com.jomminii.boardv1.common;

import java.text.MessageFormat;
import lombok.RequiredArgsConstructor;

public interface ErrorMessages {

    String getMessage(Object... args);

    default String buildFormattedMessage(String message, Object... args) {
        return MessageFormat.format(message, args);
    }

    @RequiredArgsConstructor
    enum Common implements ErrorMessages {
        INTERNAL_SERVER_ERROR("서버 오류가 발생했습니다."),
        INVALID_REQUEST("잘못된 요청입니다. 요청값 : ({0})")
        ;
        private final String message;

        @Override
        public String getMessage(Object... args) {
            return buildFormattedMessage(this.message, args);
        }
    }

    static ErrorMessages from(final String message) {
        return (args) -> MessageFormat.format(message, args);
    }
}
