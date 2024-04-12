package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.cloud.cloudbase.layer.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-14 17:46:45
 */
public class AlipayCloudCloudbaseLayerDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 6512756221437595912L;

	/** 
	 * 是否删除成功
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
