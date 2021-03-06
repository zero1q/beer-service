/*
<<<<<<< HEAD:src/main/java/com/shri/model/BeerDto.java
 * Created by zeeroiq on 9/23/20, 12:40 AM
=======
 * Created by zeeroiq on 9/19/20, 3:15 AM
>>>>>>> 6ebe9aa1787ba621fcb6e1f71e75f0d20a751182:src/main/java/com/shri/beerservice/model/BeerDto.java
 */

package com.shri.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.shri.model.enums.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BeerDto implements Serializable {

    private static final long serialVersionUID = -4938686684894780807L;


    @Null
    private UUID id;
    @Null
    private Integer version;
    @Null
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
    private OffsetDateTime createdOn;

    @Null
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
    private OffsetDateTime lastModifiedOn;

    @NotBlank
    private String beerName;
    @NotNull
    private BeerStyleEnum beerStyle;
    @Positive
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull
    private Long upc;
    @Positive
    @NotNull
    private BigDecimal price;
    private Integer quantityOnHand;

}
