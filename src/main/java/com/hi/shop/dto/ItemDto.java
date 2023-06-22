package com.hi.shop.dto;

import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.asm.Advice;

import java.time.LocalDateTime;

@Getter
@Setter
public class ItemDto {
    private Long id;
    private String itemNm;
    private Integer price;
    private String itemDetail;
    private String itemSellStatus;
    private int stockNumber;
    private LocalDateTime regTime;
    private Advice.Local updateTime;

}
