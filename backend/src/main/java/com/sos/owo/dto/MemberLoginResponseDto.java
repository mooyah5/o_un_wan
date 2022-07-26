package com.sos.owo.dto;

import com.sos.owo.domain.Gender;
import lombok.*;

import javax.validation.constraints.NotNull;

@Getter @Setter
@AllArgsConstructor
@Builder
public class MemberLoginResponseDto {
    String email;
    String accessToken;
    String refreshToken;
    int id;
    String nick;
    Gender gender;
    int age;
    double height;
    double weight;
    int activityNum;
    int activityHour;
}
