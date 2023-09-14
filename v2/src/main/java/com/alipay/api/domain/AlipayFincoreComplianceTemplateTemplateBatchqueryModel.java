package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板列表获取
 *
 * @author auto create
 * @since 1.0, 2023-05-08 15:38:00
 */
public class AlipayFincoreComplianceTemplateTemplateBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4299595961317168328L;

	/**
	 * 模板code列表
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
