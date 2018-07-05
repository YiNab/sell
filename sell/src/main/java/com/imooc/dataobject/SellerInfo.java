package com.imooc.dataobject;

import javax.persistence.Id;

public class SellerInfo {


    /** 卖家id. */
    @Id
    private String sellerId;

    /** 卖家姓名. */
    private String username;

    /** 卖家密码. */
    private String password;

    /** 微信openid . */
    private String openid;
}
