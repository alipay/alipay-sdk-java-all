package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CommerceDataUploadResponseData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.department.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 02:51:33
 */
public class AlipayCommerceMedicalIndustrydataDepartmentUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 1688222681913742691L;

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
