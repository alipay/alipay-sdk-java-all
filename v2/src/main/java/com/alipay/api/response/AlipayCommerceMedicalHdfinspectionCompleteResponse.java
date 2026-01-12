package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfinspection.complete response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 11:17:42
 */
public class AlipayCommerceMedicalHdfinspectionCompleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1693682228684362123L;

	/** 
	 * hdf检验检查单号
	 */
	@ApiField("hdf_check_no")
	private String hdfCheckNo;

	public void setHdfCheckNo(String hdfCheckNo) {
		this.hdfCheckNo = hdfCheckNo;
	}
	public String getHdfCheckNo( ) {
		return this.hdfCheckNo;
	}

}
