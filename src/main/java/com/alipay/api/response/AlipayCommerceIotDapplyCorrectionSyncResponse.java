package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.dapply.correction.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-07-01 17:12:50
 */
public class AlipayCommerceIotDapplyCorrectionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2558515872125715652L;

	/** 
	 * 修改成功/失败
	 */
	@ApiField("correction_result")
	private Boolean correctionResult;

	public void setCorrectionResult(Boolean correctionResult) {
		this.correctionResult = correctionResult;
	}
	public Boolean getCorrectionResult( ) {
		return this.correctionResult;
	}

}
