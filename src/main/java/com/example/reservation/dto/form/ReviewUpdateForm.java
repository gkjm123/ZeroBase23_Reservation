package com.example.reservation.dto.form;

import jakarta.validation.constraints.Min;
import lombok.*;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewUpdateForm {
    @Min(value = 1, message = "리뷰 아이디를 입력하세요.")
    private Long reviewId;

    @Length(max = 100, min = 10, message = "10~100자 사이로 내용을 입력해주세요.")
    private String content;
}
