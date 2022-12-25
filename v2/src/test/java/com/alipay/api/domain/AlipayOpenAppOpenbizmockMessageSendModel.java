/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * @author junying
 * @version : AlipayOpenAppOpenbizmockMessageSendModel.java, v 0.1 2020年12月02日 10:29 上午 junying Exp $
 */
public class AlipayOpenAppOpenbizmockMessageSendModel extends AlipayObject {
    private static final long serialVersionUID = 2215897481895449228L;
    @ApiField("shop_id")
    private String shopId;
    @ApiField("status")
    private String status;
    @ApiField("user_id")
    private String userId;

    public String getShopId() { return this.shopId; }

    public void setShopId(String shopId) { this.shopId = shopId; }

    public String getStatus() { return this.status; }

    public void setStatus(String status) { this.status = status; }

    public String getUserId() { return this.userId; }

    public void setUserId(String userId) { this.userId = userId; }
}