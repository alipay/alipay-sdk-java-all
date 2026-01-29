package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.hdfcheck.sync response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-26 11:03:52
 */
public class AlipayCommerceMedicalHdfcheckSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2195128851453149592L;

	/** 
	 * hdf申请单号
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
