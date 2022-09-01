package com.jomminii.boardv1.domain.board;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/boards")
public class BoardRestController {

    @PostMapping("")
    public String registerBoard() {

        return "hello";
    }
}
