package com.example.reservation.dto.form;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignInForm {
    @NotBlank(message = "아이디를 입력하세요.")
    private String loginId;

    @Length(min = 10, message = "10자리 이상의 비밀번호를 입력하세요.")
    private String password;
}
