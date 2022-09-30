package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.indirect.activity.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-31 02:55:29
 */
public class AntMerchantExpandIndirectActivityCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7292487865729513981L;

	/** 
	 * 是否存在已报名的同类型活动。（不包含报名中活动，如存在报名中活动，会以错误码告知）
FALSE:不存在
TRUE:存在
	 */
	@ApiField("has_apply")
	private String hasApply;

	/** 
	 * 活动报名ID，若活动报名调用成功会返回。
若存在同类型的报名活动，会返回已存在的活动报名ID，同时出参has_apply为TRUE
	 */
	@ApiField("order_id")
	private String orderId;

	public void setHasApply(String hasApply) {
		this.hasApply = hasApply;
	}
	public String getHasApply( ) {
		return this.hasApply;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
