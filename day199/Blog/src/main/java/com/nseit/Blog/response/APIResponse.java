package com.nseit.Blog.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Component
public class APIResponse {
    private Integer status;
    private LocalDateTime timestamp;
    private Object data;
    private ErrorResponse error;

}
