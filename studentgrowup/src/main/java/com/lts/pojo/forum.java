package com.lts.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class forum {

    private Integer id;//发帖id

    private String usercode; //用户账号

    private String title;//主题

    private String cardcontent;//发帖内容

    private Date date;//发帖日期
}
