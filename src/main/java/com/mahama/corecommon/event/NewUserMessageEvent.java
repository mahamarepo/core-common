package com.mahama.corecommon.event;

import com.alibaba.fastjson.JSONObject;
import com.mahama.corecommon.enumeration.UserMessageType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

import java.util.Date;


@Getter
@Setter
public class NewUserMessageEvent extends ApplicationEvent {
    private String title;
    private String content;
    private UserMessageType type;
    private String businessId;
    private String businessType;
    private String businessInfo;
    private Long sendTo;
    private String simpleContent;
    private JSONObject other;
    private Date startTime;
    private Date endTime;
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public NewUserMessageEvent(Object source) {
        super(source);
    }
}
