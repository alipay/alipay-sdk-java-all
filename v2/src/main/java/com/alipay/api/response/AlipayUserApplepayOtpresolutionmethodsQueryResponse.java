package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiResolutionMethod;
import com.alipay.api.domain.OpenApiResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.applepay.otpresolutionmethods.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:11
 */
public class AlipayUserApplepayOtpresolutionmethodsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7332735533491418694L;

	/** 
	 * OpenApi的Otp校验方法负责对象
	 */
	@ApiField("resolution_methods")
	private OpenApiResolutionMethod resolutionMethods;

	/** 
	 * 响应头
	 */
	@ApiField("response_header")
	private OpenApiResponseHeader responseHeader;

	public void setResolutionMethods(OpenApiResolutionMethod resolutionMethods) {
		this.resolutionMethods = resolutionMethods;
	}
	public OpenApiResolutionMethod getResolutionMethods( ) {
		return this.resolutionMethods;
	}

	public void setResponseHeader(OpenApiResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public OpenApiResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

}
