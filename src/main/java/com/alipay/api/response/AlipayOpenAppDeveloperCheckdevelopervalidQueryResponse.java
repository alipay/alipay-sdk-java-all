package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.developer.checkdevelopervalid.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:45
 */
public class AlipayOpenAppDeveloperCheckdevelopervalidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5225834153585785526L;

	/** 
	 * 支付宝账号入驻开放平台有效性检查，true表示有效，false无效
	 */
	@ApiField("dev_valid")
	private Boolean devValid;

	public void setDevValid(Boolean devValid) {
		this.devValid = devValid;
	}
	public Boolean getDevValid( ) {
		return this.devValid;
	}

}
