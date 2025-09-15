package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.common.policy.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-20 11:19:08
 */
public class AlipayInsSceneCommonPolicyCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 4461313668819611527L;

	/** 
	 * 批单号
	 */
	@ApiField("endorse_no")
	private String endorseNo;

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}
	public String getEndorseNo( ) {
		return this.endorseNo;
	}

}
