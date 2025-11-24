package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.digitalgroup.apply.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-21 11:27:41
 */
public class AntMerchantExpandDigitalgroupApplyCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8582654266927831896L;

	/** 
	 * 申请单ID，表示唯一请求，可以追踪结果
	 */
	@ApiField("apply_order_id")
	private String applyOrderId;

	public void setApplyOrderId(String applyOrderId) {
		this.applyOrderId = applyOrderId;
	}
	public String getApplyOrderId( ) {
		return this.applyOrderId;
	}

}
