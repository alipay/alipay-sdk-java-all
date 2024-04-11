package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.policy.endorse.apply response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:40
 */
public class AlipayInsScenePolicyEndorseApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3452919395935358152L;

	/** 
	 * 批单号
	 */
	@ApiField("endorse_no")
	private String endorseNo;

	/** 
	 * 商户生成的批单请求单号【幂等字段】
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setEndorseNo(String endorseNo) {
		this.endorseNo = endorseNo;
	}
	public String getEndorseNo( ) {
		return this.endorseNo;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
