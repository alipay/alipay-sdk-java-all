package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.sceneprod.benefit.add response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-20 20:45:45
 */
public class AlipayPcreditHuabeiSceneprodBenefitAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 3669382173349513279L;

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
