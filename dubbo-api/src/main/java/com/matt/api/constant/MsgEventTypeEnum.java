package com.matt.api.constant;

/**
 * @description:
 * @author：wwei
 * @date: 2022/6/26
 */
public enum MsgEventTypeEnum {
    SEND_MSG_TO_ADMINISTRATOR(2,"发送站内通知给管理员"),
    SEND_EMAIL_TO_ADMINISTRATOR(1,"发送邮件给管理员"),
    ;


    private int code ;
    private String desc;

    MsgEventTypeEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
