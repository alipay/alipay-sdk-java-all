package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约平台短信接口
 *
 * @author auto create
 * @since 1.0, 2026-05-18 11:52:48
 */
public class AlipayCommerceMedicalSmsSendModel extends AlipayObject {

	private static final long serialVersionUID = 5278445715959472987L;

	/**
	 * 履约单ID
	 */
	@ApiField("fulfill_order_id")
	private String fulfillOrderId;

	/**
	 * 来源
	 */
	@ApiField("source")
	private String source;

	/**
	 * 短信模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模板参数
	 */
	@ApiField("template_value")
	private String templateValue;

	public String getFulfillOrderId() {
		return this.fulfillOrderId;
	}
	public void setFulfillOrderId(String fulfillOrderId) {
		this.fulfillOrderId = fulfillOrderId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateValue() {
		return this.templateValue;
	}
	public void setTemplateValue(String templateValue) {
		this.templateValue = templateValue;
	}

}
