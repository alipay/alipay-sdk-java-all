package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.sfleadsmember.delete response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-14 14:26:31
 */
public class AnttechOceanbaseObglobalSfleadsmemberDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5559724192817931574L;

	/** 
	 * 响应结果
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
