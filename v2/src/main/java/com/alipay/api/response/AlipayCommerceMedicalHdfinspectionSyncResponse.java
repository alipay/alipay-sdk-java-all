package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfinspection.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-18 15:47:42
 */
public class AlipayCommerceMedicalHdfinspectionSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8564441344998151272L;

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
