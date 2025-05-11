package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.digitalmgmt.welfarefoundation.updatevolunteers.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:50
 */
public class AlipayDigitalmgmtWelfarefoundationUpdatevolunteersCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5572413337189226258L;

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
