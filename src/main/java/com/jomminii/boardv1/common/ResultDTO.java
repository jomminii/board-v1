package com.jomminii.boardv1.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor(staticName = "of")
public class ResultDTO<D> {

    private final String resultCode;
    private final String message;
    private final D data;


    public static <D> ResultDTO<D> ofSuccess() {
        return new ResultDTO<>("SUCCESS", null, null);
    }

    public static <D> ResultDTO<D> ofSuccess(String message, D data) {
        return new ResultDTO<>("SUCCESS", message, data);
    }

    public static <D> ResultDTO<D> ofFail(String message) {
        return new ResultDTO<>("FAIL", message, null);
    }
}
