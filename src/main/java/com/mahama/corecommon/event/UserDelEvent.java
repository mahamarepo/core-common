package com.mahama.corecommon.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class UserDelEvent extends ApplicationEvent {
    private Long userId;

    public UserDelEvent(Object source) {
        super(source);
    }

    public UserDelEvent(Object source, Long userId) {
        super(source);
        this.userId = userId;
    }
}