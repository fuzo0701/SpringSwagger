package com.example.springswagger.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @Operation(summary = "업체 회원가입" , description = "업체 측에서 회원가입 할 때 사용하는 API")
    @ApiResponses( value = {
            @ApiResponse( responseCode = "10000", description = "요청에 성공하였습니다."),
            @ApiResponse( responseCode = "20000", description = "요청에 실폐하였습니다.")

    })
    @Parameters({
            @Parameter(name = "email", description = "이메일", example = "chrome123@naver.com"),
            @Parameter(name = "name", description = "이름", example = "홍길동")
    })
    @GetMapping("/index")
    public String index() {
        return "AAAA";
    }
}
