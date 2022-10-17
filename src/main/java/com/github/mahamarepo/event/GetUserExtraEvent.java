package com.github.mahamarepo.event;

import com.github.mahamarepo.extra.UserExtraInterface;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class GetUserExtraEvent extends ApplicationEvent {
    private Long userId;
    private UserExtraInterface extra;

    public GetUserExtraEvent(Object source) {
        super(source);
    }
}
