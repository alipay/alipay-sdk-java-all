package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.employment.batchpreorder.submit response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-17 10:32:55
 */
public class AlipayInsSceneEmploymentBatchpreorderSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2765722979832133537L;

	/** 
	 * 外部幂等单号
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
