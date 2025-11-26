package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.indirect.reward.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:16:43
 */
public class AlipayMerchantIndirectRewardApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4462875864529239862L;

	/** 
	 * 权益发放状态。领奖审批结果，平台会对提交信息进行校验，并返回判断结果
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 权益编码
	 */
	@ApiField("reward_code")
	private String rewardCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}
	public String getRewardCode( ) {
		return this.rewardCode;
	}

}
