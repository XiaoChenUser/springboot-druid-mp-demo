package com.example.dto;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
@TableName("user")
public class UserDTO {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private Date createAt;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;


    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
