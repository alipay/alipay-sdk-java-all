package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsOpenPolicyDigestDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.common.order.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-27 15:32:04
 */
public class AlipayInsSceneCommonOrderApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 1696995253232276358L;

	/** 
	 * 保单摘要数据
	 */
	@ApiField("policy")
	private InsOpenPolicyDigestDTO policy;

	public void setPolicy(InsOpenPolicyDigestDTO policy) {
		this.policy = policy;
	}
	public InsOpenPolicyDigestDTO getPolicy( ) {
		return this.policy;
	}

}
