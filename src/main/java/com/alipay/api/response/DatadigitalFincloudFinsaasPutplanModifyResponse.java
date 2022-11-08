package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.putplan.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-13 22:51:49
 */
public class DatadigitalFincloudFinsaasPutplanModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1538773637342399415L;

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
