package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GetOfficePreviewURLResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.filepreviewurl.generate response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-10 15:55:22
 */
public class AlipaySecurityProdTemplateFilepreviewurlGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1265458135823619778L;

	/** 
	 * 获取预览地址返回结果
	 */
	@ApiField("get_office_preview_url_response")
	private GetOfficePreviewURLResponse getOfficePreviewUrlResponse;

	public void setGetOfficePreviewUrlResponse(GetOfficePreviewURLResponse getOfficePreviewUrlResponse) {
		this.getOfficePreviewUrlResponse = getOfficePreviewUrlResponse;
	}
	public GetOfficePreviewURLResponse getGetOfficePreviewUrlResponse( ) {
		return this.getOfficePreviewUrlResponse;
	}

}
