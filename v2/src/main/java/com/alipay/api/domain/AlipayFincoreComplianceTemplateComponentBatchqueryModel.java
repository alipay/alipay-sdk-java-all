package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板组件列表
 *
 * @author auto create
 * @since 1.0, 2024-06-12 11:03:18
 */
public class AlipayFincoreComplianceTemplateComponentBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2682842829567885434L;

	/**
	 * 模版编码列表
	 */
	@ApiListField("template_codes")
	@ApiField("string")
	private List<String> templateCodes;

	/**
	 * 模板库编码
	 */
	@ApiField("template_lib_code")
	private String templateLibCode;

	public List<String> getTemplateCodes() {
		return this.templateCodes;
	}
	public void setTemplateCodes(List<String> templateCodes) {
		this.templateCodes = templateCodes;
	}

	public String getTemplateLibCode() {
		return this.templateLibCode;
	}
	public void setTemplateLibCode(String templateLibCode) {
		this.templateLibCode = templateLibCode;
	}

}
