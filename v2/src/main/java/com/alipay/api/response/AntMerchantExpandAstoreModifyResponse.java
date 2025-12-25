package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.astore.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-27 18:07:41
 */
public class AntMerchantExpandAstoreModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2615172337332295774L;

	/** 
	 * 结算信息修改提交的申请单
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
