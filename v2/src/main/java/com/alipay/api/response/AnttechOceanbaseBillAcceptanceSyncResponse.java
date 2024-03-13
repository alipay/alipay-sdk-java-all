package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.bill.acceptance.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-12-21 10:57:06
 */
public class AnttechOceanbaseBillAcceptanceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 7397888886636939357L;

	/** 
	 * success字段写入失败为false时，需要通过errorMsg返回失败原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

}
