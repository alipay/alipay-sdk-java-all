package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板查询接口
 *
 * @author auto create
 * @since 1.0, 2018-12-24 10:57:26
 */
public class AlipayOpenPublicTemplateMessageQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5861296134984394713L;

	/**
	 * 模板id
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
