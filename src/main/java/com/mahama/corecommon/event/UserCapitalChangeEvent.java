package com.mahama.corecommon.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

import java.math.BigDecimal;

@Getter
@Setter
public class UserCapitalChangeEvent extends ApplicationEvent {
    private Long userId;
    private BigDecimal score;
    private BigDecimal money;
    private String channel;
    private String des;

    public UserCapitalChangeEvent(Object source) {
        super(source);
    }
}
