package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.welfarefoundation.updatevolunteers.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:16:44
 */
public class AlipayDigitalmgmtWelfarefoundationUpdatevolunteersCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1727556935672447311L;

	/** 
	 * 操作结果
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
