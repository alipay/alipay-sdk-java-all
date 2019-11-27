package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能方案模板
 *
 * @author auto create
 * @since 1.0, 2017-09-06 17:52:22
 */
public class InteligentpromoPlanTemplate extends AlipayObject {

	private static final long serialVersionUID = 6531863652588744422L;

	/**
	 * 业务数据
	 */
	@ApiField("business_data")
	private InteligentpromoBusinessData businessData;

	/**
	 * 智能方案模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 智能方案模板名称，比如全场每满减或者消费送
	 */
	@ApiField("template_name")
	private String templateName;

	public InteligentpromoBusinessData getBusinessData() {
		return this.businessData;
	}
	public void setBusinessData(InteligentpromoBusinessData businessData) {
		this.businessData = businessData;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
