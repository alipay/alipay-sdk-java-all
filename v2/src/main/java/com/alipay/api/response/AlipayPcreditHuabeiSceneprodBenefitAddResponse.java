package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.sceneprod.benefit.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-31 00:11:58
 */
public class AlipayPcreditHuabeiSceneprodBenefitAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4144314151742186829L;

	/** 
	 * 追加预算流水ID
	 */
	@ApiField("append_id")
	private String appendId;

	public void setAppendId(String appendId) {
		this.appendId = appendId;
	}
	public String getAppendId( ) {
		return this.appendId;
	}

}
