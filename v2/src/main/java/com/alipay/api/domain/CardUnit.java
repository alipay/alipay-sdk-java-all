package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个卡片内容
 *
 * @author auto create
 * @since 1.0, 2024-10-10 19:18:28
 */
public class CardUnit extends AlipayObject {

	private static final long serialVersionUID = 5433794633132635685L;

	/**
	 * 模板类型
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 模版数据，包含文本、标题、卡片数据
	 */
	@ApiField("template_data")
	private TemplateDataDTO templateData;

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public TemplateDataDTO getTemplateData() {
		return this.templateData;
	}
	public void setTemplateData(TemplateDataDTO templateData) {
		this.templateData = templateData;
	}

}
