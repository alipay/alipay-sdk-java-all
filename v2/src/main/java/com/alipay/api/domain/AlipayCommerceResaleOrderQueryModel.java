package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 二手售卖订单查询接口
 *
 * @author auto create
 * @since 1.0, 2026-07-06 17:41:30
 */
public class AlipayCommerceResaleOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4187726373267529745L;

	/**
	 * 支付宝openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
