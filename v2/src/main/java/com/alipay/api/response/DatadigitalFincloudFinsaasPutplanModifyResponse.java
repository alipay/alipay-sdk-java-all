package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.putplan.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 21:26:08
 */
public class DatadigitalFincloudFinsaasPutplanModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8855274179324763344L;

	/** 
	 * 活动编辑结果，true 表示成功
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
