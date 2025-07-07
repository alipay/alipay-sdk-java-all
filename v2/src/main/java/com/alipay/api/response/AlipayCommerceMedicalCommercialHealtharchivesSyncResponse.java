package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.healtharchives.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-27 17:12:26
 */
public class AlipayCommerceMedicalCommercialHealtharchivesSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2617751369132469596L;

	/** 
	 * 外部业务单号
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
