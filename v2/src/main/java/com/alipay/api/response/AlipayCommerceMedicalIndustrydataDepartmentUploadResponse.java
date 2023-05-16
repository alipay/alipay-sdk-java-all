package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommerceDataUploadResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.department.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-04 16:38:53
 */
public class AlipayCommerceMedicalIndustrydataDepartmentUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8627481724586467645L;

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
