package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.sceneprod.benefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:35:56
 */
public class AlipayPcreditHuabeiSceneprodBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3892451984336589726L;

	/** 
	 * 权益ID，创建成功后返回
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
