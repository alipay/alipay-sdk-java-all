package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpaccess.domain.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-08 23:41:39
 */
public class AlipayCloudCloudbaseHttpaccessDomainModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7118978834645668219L;

	/** 
	 * 是否修改成功
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
