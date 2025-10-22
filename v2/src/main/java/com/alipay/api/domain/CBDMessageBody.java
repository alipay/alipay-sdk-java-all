package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家医产品中问诊对话消息体
 *
 * @author auto create
 * @since 1.0, 2025-04-02 13:50:41
 */
public class CBDMessageBody extends AlipayObject {

	private static final long serialVersionUID = 8295211961358152996L;

	/**
	 * 消息模板编号
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 消息体内容，对应消息模板编号
	 */
	@ApiField("template_data")
	private String templateData;

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getTemplateData() {
		return this.templateData;
	}
	public void setTemplateData(String templateData) {
		this.templateData = templateData;
	}

}
