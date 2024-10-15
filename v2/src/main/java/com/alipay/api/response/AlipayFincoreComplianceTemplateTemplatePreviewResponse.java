package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TemplatePreviewResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.compliance.template.template.preview response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-13 15:02:59
 */
public class AlipayFincoreComplianceTemplateTemplatePreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 1287654369659517242L;

	/** 
	 * 模板预览列表
	 */
	@ApiListField("template_preview_response")
	@ApiField("template_preview_response")
	private List<TemplatePreviewResponse> templatePreviewResponse;

	public void setTemplatePreviewResponse(List<TemplatePreviewResponse> templatePreviewResponse) {
		this.templatePreviewResponse = templatePreviewResponse;
	}
	public List<TemplatePreviewResponse> getTemplatePreviewResponse( ) {
		return this.templatePreviewResponse;
	}

}
