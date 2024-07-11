package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.charger.pnc.close response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-21 13:46:57
 */
public class AlipayCommerceTransportChargerPncCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 5435452622475518463L;

	/** 
	 * 关闭结果
	 */
	@ApiField("status")
	private Boolean status;

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
