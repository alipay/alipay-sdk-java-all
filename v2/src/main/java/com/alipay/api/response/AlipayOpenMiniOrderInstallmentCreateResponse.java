package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.order.installment.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-11 18:47:22
 */
public class AlipayOpenMiniOrderInstallmentCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8514529853792792169L;

	/** 
	 * 分期单号。在代扣等场景下使用
	 */
	@ApiField("installment_order_id")
	private String installmentOrderId;

	public void setInstallmentOrderId(String installmentOrderId) {
		this.installmentOrderId = installmentOrderId;
	}
	public String getInstallmentOrderId( ) {
		return this.installmentOrderId;
	}

}
