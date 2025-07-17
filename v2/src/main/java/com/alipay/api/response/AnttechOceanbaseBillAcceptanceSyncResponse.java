package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.bill.acceptance.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-21 11:03:24
 */
public class AnttechOceanbaseBillAcceptanceSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5179716555332247837L;

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
