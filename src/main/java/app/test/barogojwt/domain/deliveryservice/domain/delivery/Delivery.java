package app.test.barogojwt.domain.deliveryservice.domain.delivery;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`delivery`")
@Getter
@NoArgsConstructor
public class Delivery {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    private String deliveryAddress;

    private long shopId;

    private long userId;

    private LocalDateTime expectCookTime;

    private LocalDateTime created;

    private LocalDateTime updated;

}