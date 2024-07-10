package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommerceDataUploadResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.hospital.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-04 01:21:52
 */
public class AlipayCommerceMedicalIndustrydataHospitalUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6784156344558241236L;

	/** 
	 * 响应数据
	 */
	@ApiField("data")
	private CommerceDataUploadResponseData data;

	public void setData(CommerceDataUploadResponseData data) {
		this.data = data;
	}
	public CommerceDataUploadResponseData getData( ) {
		return this.data;
	}

}
