package com.example.demo.sticker;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 
 * </p>
 *
 * @author jhb
 * @since 2023-10-29
 */

@NoArgsConstructor  //无参构造对象
@AllArgsConstructor //有参构造对象
@Data   //必须加上这个才能被引用
public class Sticker  {
    private Integer id;
    private String sender;
    private String receiver;
    private String send_time;
    private String content;
    private String kind;
    private String bgcolor;

    public Integer getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSend_time() {
        return send_time;
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

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSend_time(String send_time) {
        this.send_time = send_time;
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
