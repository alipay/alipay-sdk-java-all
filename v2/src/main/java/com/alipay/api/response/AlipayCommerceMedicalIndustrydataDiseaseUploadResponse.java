package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommerceDataUploadResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.disease.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:11:28
 */
public class AlipayCommerceMedicalIndustrydataDiseaseUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5874626341433575331L;

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
