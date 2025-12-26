package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广消息模板规则
 *
 * @author auto create
 * @since 1.0, 2023-08-29 20:57:29
 */
public class DeliveryTemplateRule extends AlipayObject {

	private static final long serialVersionUID = 5647977877263682993L;

	/**
	 * 指定商家消息区域
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
