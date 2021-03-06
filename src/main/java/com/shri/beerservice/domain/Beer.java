/*
 * Created by  ZeeroIQ on 9/11/20, 12:01 AM
 */

package com.shri.beerservice.domain;

import com.shri.model.enums.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Beer implements Serializable {

    private static final long serialVersionUID = -1320960094771585288L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUDI", strategy = "org.hibernate.id.UUIDGenerator")
    @Type(type="org.hibernate.type.UUIDCharType")
    @Column(length = 40, columnDefinition = "varchar(40)", updatable = false, nullable = false)
    private UUID id;
    @Version
    private Integer version;
    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdOn;
    @UpdateTimestamp
    private Timestamp lastModifiedOn;
    private String beerName;
    private BeerStyleEnum beerStyle;
    @Column(unique = true)
    private String upc;
    private BigDecimal price;
//    @Column(name = "quantity_on_hand")
    private Integer quantityOnHand;
    private Integer quantityToBrew;
}
