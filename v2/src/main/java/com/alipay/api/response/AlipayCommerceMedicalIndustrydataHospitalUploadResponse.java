package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommerceDataUploadResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.hospital.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:40:16
 */
public class AlipayCommerceMedicalIndustrydataHospitalUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 6182793937353449465L;

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
