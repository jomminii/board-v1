package com.jomminii.boardv1.domain.board;

import com.jomminii.boardv1.common.ResultDTO;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/boards")
public class BoardRestController {

    @PostMapping("")
    public ResultDTO<Object> registerBoard() {
//        return ResultDTO.of("resultCode", "Message", ResultDTO.of("a","b","c"));
//        return ResultDTO.ofSuccess();
//        return ResultDTO.ofSuccess("성공!!", ResultDTO.of("a", "b", "c"));
        return ResultDTO.ofFail("실패!!");
    }

    @GetMapping("")
    public ResultDTO<Object> exceptionTest() throws Exception {
        throw new Exception("error test");
    }

    @ExceptionHandler(Exception.class)
    public ResultDTO<Object> handlerException(Exception exception) {
        return ResultDTO.ofFail("이게 먼저다!");
    }
}
