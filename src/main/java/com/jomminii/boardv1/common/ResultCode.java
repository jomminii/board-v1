package com.jomminii.boardv1.common;

import lombok.NoArgsConstructor;

public interface ResultCode {

    String getResultCodeName();

    @NoArgsConstructor
    enum Common implements ResultCode {
        SUCCESS,
        FAIL,
        INVALID_REQUEST,
        ;

        @Override
        public String getResultCodeName() {
            return this.name();
        }
    }
}
