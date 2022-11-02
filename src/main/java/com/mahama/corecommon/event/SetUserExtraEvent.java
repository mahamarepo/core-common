package com.mahama.corecommon.event;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

@Getter
@Setter
public class SetUserExtraEvent extends ApplicationEvent {
    private Long userId;
    private JSONObject extra;

    public SetUserExtraEvent(Object source) {
        super(source);
    }
}
