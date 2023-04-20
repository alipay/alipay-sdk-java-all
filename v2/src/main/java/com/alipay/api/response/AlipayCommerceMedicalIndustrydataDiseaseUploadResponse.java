package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommerceDataUploadResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.disease.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 01:32:54
 */
public class AlipayCommerceMedicalIndustrydataDiseaseUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1229223948619857719L;

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
