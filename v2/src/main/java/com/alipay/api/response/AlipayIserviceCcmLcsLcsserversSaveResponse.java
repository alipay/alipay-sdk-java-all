package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.lcs.lcsservers.save response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:56:50
 */
public class AlipayIserviceCcmLcsLcsserversSaveResponse extends AlipayResponse {

	private static final long serialVersionUID = 6556186263533911645L;

	/** 
	 * 操作返回结果
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
