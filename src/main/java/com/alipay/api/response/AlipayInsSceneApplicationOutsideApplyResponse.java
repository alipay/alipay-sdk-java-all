package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.application.outside.apply response.
 * 
 * @author auto create
 * @since 1.0, 2019-12-02 17:31:30
 */
public class AlipayInsSceneApplicationOutsideApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4412552987923541491L;

	/** 
	 * 外部业务号(与入参调用外部业务号一致)
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPolicyNo( ) {
		return this.policyNo;
	}

}
