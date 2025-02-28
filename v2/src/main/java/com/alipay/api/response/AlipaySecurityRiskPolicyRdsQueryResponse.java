package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.policy.rds.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:21
 */
public class AlipaySecurityRiskPolicyRdsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5454444977623465557L;

	/** 
	 * 人机识别结果。返回HUMAN表示识别结果为人；返回ROBOT表示识别结果为机器。只有返回ROBOT时，业务才执行拦截动作，其它返回值均不做拦截。
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
