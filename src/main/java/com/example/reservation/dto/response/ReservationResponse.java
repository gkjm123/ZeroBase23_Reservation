package com.example.reservation.dto.response;

import com.example.reservation.entity.ReservationEntity;
import com.example.reservation.type.ReservationType;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservationResponse {
    private Long id;
    private Long storeId;
    private Long userId;
    private LocalDateTime reserveDate;
    private LocalDateTime createDate;
    private ReservationType status;

    public static ReservationResponse fromEntity(ReservationEntity reservationEntity) {
        return ReservationResponse.builder()
                .id(reservationEntity.getId())
                .storeId(reservationEntity.getStoreEntity().getId())
                .userId(reservationEntity.getUserEntity().getId())
                .reserveDate(reservationEntity.getReserveDate())
                .createDate(reservationEntity.getCreateDate())
                .status(reservationEntity.getStatus())
                .build();
    }
}
