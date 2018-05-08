package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.policy.rds.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-11-14 15:00:33
 */
public class AlipaySecurityRiskPolicyRdsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2882439915849772516L;

	/** 
	 * 人机识别结果。返回HUMAN表示识别结果为人；返回ROBOT表示识别结果为机器。
	 */
	@ApiField("rds_result")
	private String rdsResult;

	public void setRdsResult(String rdsResult) {
		this.rdsResult = rdsResult;
	}
	public String getRdsResult( ) {
		return this.rdsResult;
	}

}
