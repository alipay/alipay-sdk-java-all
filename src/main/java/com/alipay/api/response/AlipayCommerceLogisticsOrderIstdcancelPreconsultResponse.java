package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.logistics.order.istdcancel.preconsult response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-20 11:39:07
 */
public class AlipayCommerceLogisticsOrderIstdcancelPreconsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3115521631794234744L;

	/** 
	 * 是否允许取消
	 */
	@ApiField("allow_cancel")
	private Boolean allowCancel;

	public void setAllowCancel(Boolean allowCancel) {
		this.allowCancel = allowCancel;
	}
	public Boolean getAllowCancel( ) {
		return this.allowCancel;
	}

}
