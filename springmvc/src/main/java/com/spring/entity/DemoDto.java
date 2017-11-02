package com.spring.entity;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class DemoDto implements Serializable{

    @NotNull(message = "name不能为空")
    private String name;
    @NotNull(message = "desc不能为空")
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
