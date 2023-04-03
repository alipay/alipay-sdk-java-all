package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.bill.order.download response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 03:31:24
 */
public class AlipayEcoRenthouseBillOrderDownloadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4484591811411257897L;

	/** 
	 * 状态值（等级值、未授权、未知）
	 */
	@ApiField("status_value")
	private String statusValue;

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}
	public String getStatusValue( ) {
		return this.statusValue;
	}

}
