package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.marketing.mcaplatform.contract.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:30:52
 */
public class MybankMarketingMcaplatformContractQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1593217494277492317L;

	/** 
	 * sign_status, 唯一，绿色经营签约查询
枚举值：
S 2.0签约
Y 1.0签约
F 解约
N 未签约
	 */
	@ApiField("sign_status")
	private String signStatus;

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

}
