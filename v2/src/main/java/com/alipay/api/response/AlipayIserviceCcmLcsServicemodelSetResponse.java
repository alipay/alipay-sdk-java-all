package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.lcs.servicemodel.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-03-13 03:41:39
 */
public class AlipayIserviceCcmLcsServicemodelSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5316155576338815382L;

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
