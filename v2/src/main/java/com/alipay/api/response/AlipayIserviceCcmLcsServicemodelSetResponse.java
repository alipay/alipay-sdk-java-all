package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.lcs.servicemodel.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 21:21:57
 */
public class AlipayIserviceCcmLcsServicemodelSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5694844151243413476L;

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
