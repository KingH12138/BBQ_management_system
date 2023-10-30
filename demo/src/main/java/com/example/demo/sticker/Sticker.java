package com.example.demo.sticker;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author jhb
 * @since 2023-10-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("sticker")
public class Sticker implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @TableField("sender")
    private String sender;

    @TableField("receiver")
    private String receiver;

    @TableField("send_time")
    private LocalDateTime sendTime;

    @TableField("content")
    private String content;

    @TableField("kind")
    private String kind;

    @TableField("bgcolor")
    private String bgcolor;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public String getContent() {
        return content;
    }

    public String getKind() {
        return kind;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }
}
