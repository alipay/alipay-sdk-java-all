package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板预览
 *
 * @author auto create
 * @since 1.0, 2025-01-10 15:55:48
 */
public class AlipayFincoreComplianceTemplateTemplatePreviewModel extends AlipayObject {

	private static final long serialVersionUID = 2515573387941361434L;

	/**
	 * 模版编码列表
	 */
	@ApiListField("template_codes")
	@ApiField("string")
	private List<String> templateCodes;

	public List<String> getTemplateCodes() {
		return this.templateCodes;
	}
	public void setTemplateCodes(List<String> templateCodes) {
		this.templateCodes = templateCodes;
	}

}
