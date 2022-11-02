package com.mahama.corecommon.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class UserFreezeEvent extends ApplicationEvent {
    private Long userId;

    public UserFreezeEvent(Object source) {
        super(source);
    }

    public UserFreezeEvent(Object source, Long userId) {
        super(source);
        this.userId = userId;
    }
}