package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.CreateTextParamsResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.oceanbase.obglobal.bailingual.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-15 15:17:44
 */
public class AnttechOceanbaseObglobalBailingualCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1856171237128885164L;

	/** 
	 * 在百灵创建文案接口的返回对象
	 */
	@ApiField("create_text_params_response")
	private CreateTextParamsResponse createTextParamsResponse;

	public void setCreateTextParamsResponse(CreateTextParamsResponse createTextParamsResponse) {
		this.createTextParamsResponse = createTextParamsResponse;
	}
	public CreateTextParamsResponse getCreateTextParamsResponse( ) {
		return this.createTextParamsResponse;
	}

}
