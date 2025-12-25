package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡片模板详情
 *
 * @author auto create
 * @since 1.0, 2024-12-04 14:42:56
 */
public class PageContentCardDetail extends AlipayObject {

	private static final long serialVersionUID = 3748386362767197129L;

	/**
	 * 模板具体数据
	 */
	@ApiListField("contents")
	@ApiField("template_data")
	private List<TemplateData> contents;

	/**
	 * 顺序号
	 */
	@ApiField("index")
	private String index;

	/**
	 * 模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public List<TemplateData> getContents() {
		return this.contents;
	}
	public void setContents(List<TemplateData> contents) {
		this.contents = contents;
	}

	public String getIndex() {
		return this.index;
	}
	public void setIndex(String index) {
		this.index = index;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
