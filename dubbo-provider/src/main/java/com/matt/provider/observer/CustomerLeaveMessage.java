package com.matt.provider.observer;

/**
 * @description:
 * @author：wwei
 * @date: 2022/4/28
 */
public class CustomerLeaveMessage {

    private static final long serialVersionUID = 1L;

    private String id;    // 主键

    private String name;      // 联系人

    private String phone;     // 联系电话

    private String email;     // 联系邮箱

    private String content;       // 留言内容

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
