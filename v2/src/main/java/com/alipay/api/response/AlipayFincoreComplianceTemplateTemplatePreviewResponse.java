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
 * @since 1.0, 2023-05-29 20:06:50
 */
public class AlipayFincoreComplianceTemplateTemplatePreviewResponse extends AlipayResponse {

	private static final long serialVersionUID = 5663461215839583737L;

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
