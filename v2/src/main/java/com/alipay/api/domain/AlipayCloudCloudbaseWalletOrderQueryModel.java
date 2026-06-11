package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单查询
 *
 * @author auto create
 * @since 1.0, 2026-05-27 15:52:42
 */
public class AlipayCloudCloudbaseWalletOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6185422319651348454L;

	/**
	 * 小程序id
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
