package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:12:58
 */
public class QianfanCardComponent extends AlipayObject {

	private static final long serialVersionUID = 4332198746342364585L;

	/**
	 * 参数映射
	 */
	@ApiField("param_mapping")
	private String paramMapping;

	/**
	 * 后置引导语
	 */
	@ApiField("post_guide")
	private String postGuide;

	/**
	 * 前置引导语
	 */
	@ApiField("pre_guide")
	private String preGuide;

	/**
	 * 模版内容
	 */
	@ApiField("template_content")
	private String templateContent;

	public String getParamMapping() {
		return this.paramMapping;
	}
	public void setParamMapping(String paramMapping) {
		this.paramMapping = paramMapping;
	}

	public String getPostGuide() {
		return this.postGuide;
	}
	public void setPostGuide(String postGuide) {
		this.postGuide = postGuide;
	}

	public String getPreGuide() {
		return this.preGuide;
	}
	public void setPreGuide(String preGuide) {
		this.preGuide = preGuide;
	}

	public String getTemplateContent() {
		return this.templateContent;
	}
	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}

}
