package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板信息（基于合同模板填充内容生成待签文件，并指定签署人）	
 *
 * @author auto create
 * @since 1.0, 2020-05-06 13:44:20
 */
public class TemplateInfoBean extends AlipayObject {

	private static final long serialVersionUID = 4379946465993576769L;

	/**
	 * 模板填充项，根据组件key值传入填写内容
	 */
	@ApiField("fill_contents")
	private FillContent fillContents;

	/**
	 * 签署文件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 签署区，根据签署区key值传入对应的签署人信息
	 */
	@ApiField("signfields")
	private SignFieldBean signfields;

	/**
	 * 模板id，通过创建合同模板获取
	 */
	@ApiField("template_id")
	private String templateId;

	public FillContent getFillContents() {
		return this.fillContents;
	}
	public void setFillContents(FillContent fillContents) {
		this.fillContents = fillContents;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public SignFieldBean getSignfields() {
		return this.signfields;
	}
	public void setSignfields(SignFieldBean signfields) {
		this.signfields = signfields;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
