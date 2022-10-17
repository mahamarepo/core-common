package com.github.mahamarepo.event;

import com.github.mahamarepo.extra.UserExtraInterface;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class SetUserExtraEvent extends ApplicationEvent {
    private Long userId;
    private UserExtraInterface extra;

    public SetUserExtraEvent(Object source) {
        super(source);
    }
}
