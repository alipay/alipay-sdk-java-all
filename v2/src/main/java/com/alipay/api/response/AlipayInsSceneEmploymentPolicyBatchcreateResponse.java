package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.policy.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:41:38
 */
public class AlipayInsSceneEmploymentPolicyBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1636711141639411527L;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
