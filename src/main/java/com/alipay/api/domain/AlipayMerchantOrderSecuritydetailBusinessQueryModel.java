package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * B端订单详情查询-安全云专用	
 *
 * @author auto create
 * @since 1.0, 2019-09-14 17:41:23
 */
public class AlipayMerchantOrderSecuritydetailBusinessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1647139975326269741L;

	/**
	 * 业务号（目前仅支持交易号）
注： 1. order_id、biz_no、两者必选其一
2.若同时传递，忽略biz_no
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 支付宝订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
