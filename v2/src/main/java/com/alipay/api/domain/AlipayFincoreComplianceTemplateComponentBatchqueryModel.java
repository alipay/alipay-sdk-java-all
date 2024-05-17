package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板组件列表
 *
 * @author auto create
 * @since 1.0, 2024-05-13 15:02:37
 */
public class AlipayFincoreComplianceTemplateComponentBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7568231855239615694L;

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
