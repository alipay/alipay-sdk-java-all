package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommerceDataUploadResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.doctor.upload response.
 * 
 * @author auto create
 * @since 1.0, 2022-03-02 10:31:35
 */
public class AlipayCommerceMedicalIndustrydataDoctorUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2157615991999952438L;

	/** 
	 * 业务响应数据
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
