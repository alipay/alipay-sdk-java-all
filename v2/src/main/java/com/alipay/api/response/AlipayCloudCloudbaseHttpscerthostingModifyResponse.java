package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.httpscerthosting.modify response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-04 11:08:53
 */
public class AlipayCloudCloudbaseHttpscerthostingModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2214235184981998515L;

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
