package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板内容
 *
 * @author auto create
 * @since 1.0, 2025-05-07 15:29:40
 */
public class TemplateContent extends AlipayObject {

	private static final long serialVersionUID = 3776512644173734668L;

	/**
	 * 模板内容的语义注解。用来辅助大模型理解
	 */
	@ApiField("annotation")
	private String annotation;

	/**
	 * 模板code
	 */
	@ApiField("tpl_code")
	private String tplCode;

	/**
	 * 模板数据
	 */
	@ApiField("tpl_data")
	private String tplData;

	public String getAnnotation() {
		return this.annotation;
	}
	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public String getTplCode() {
		return this.tplCode;
	}
	public void setTplCode(String tplCode) {
		this.tplCode = tplCode;
	}

	public String getTplData() {
		return this.tplData;
	}
	public void setTplData(String tplData) {
		this.tplData = tplData;
	}

}
