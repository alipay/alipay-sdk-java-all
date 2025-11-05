package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通用内容对象，包含模版id、类型和模版数据
 *
 * @author auto create
 * @since 1.0, 2024-09-10 20:01:19
 */
public class ChatContentDTO extends AlipayObject {

	private static final long serialVersionUID = 8334265151735635336L;

	/**
	 * 展示序号
	 */
	@ApiField("index")
	private Long index;

	/**
	 * 模版数据，挂号agent返回的卡片数据会存放于此
	 */
	@ApiField("template_data")
	private TemplateDataDTO templateData;

	/**
	 * 模版id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 模版类型
	 */
	@ApiField("template_type")
	private String templateType;

	public Long getIndex() {
		return this.index;
	}
	public void setIndex(Long index) {
		this.index = index;
	}

	public TemplateDataDTO getTemplateData() {
		return this.templateData;
	}
	public void setTemplateData(TemplateDataDTO templateData) {
		this.templateData = templateData;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

}
