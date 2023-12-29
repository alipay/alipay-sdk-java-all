package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.pcreditbenefit.item.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 01:27:27
 */
public class AlipayPcreditHuabeiPcreditbenefitItemSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 1262714795932581867L;

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
