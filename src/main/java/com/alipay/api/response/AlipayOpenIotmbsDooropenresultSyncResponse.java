package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotmbs.dooropenresult.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-29 16:11:46
 */
public class AlipayOpenIotmbsDooropenresultSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8191667159869473485L;

	/** 
	 * 成功true失败false
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
