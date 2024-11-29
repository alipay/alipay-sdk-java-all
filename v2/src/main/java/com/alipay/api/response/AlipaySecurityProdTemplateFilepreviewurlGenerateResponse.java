package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.GetOfficePreviewURLResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.template.filepreviewurl.generate response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-11 19:49:27
 */
public class AlipaySecurityProdTemplateFilepreviewurlGenerateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8857865598676918915L;

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
