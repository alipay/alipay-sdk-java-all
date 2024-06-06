package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模板信息（基于合同模板填充内容生成待签文件，并指定签署人）	
 *
 * @author auto create
 * @since 1.0, 2020-05-15 10:41:38
 */
public class TemplateInfoBean extends AlipayObject {

	private static final long serialVersionUID = 7342439934551621244L;

	/**
	 * 模板填充项，根据组件key值传入填写内容
	 */
	@ApiListField("fill_contents")
	@ApiField("fill_content")
	private List<FillContent> fillContents;

	/**
	 * 签署文件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 签署区，根据签署区key值传入对应的签署人信息
	 */
	@ApiListField("signfields")
	@ApiField("sign_field_bean")
	private List<SignFieldBean> signfields;

	/**
	 * 模板id，通过创建合同模板获取
	 */
	@ApiField("template_id")
	private String templateId;

	public List<FillContent> getFillContents() {
		return this.fillContents;
	}
	public void setFillContents(List<FillContent> fillContents) {
		this.fillContents = fillContents;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<SignFieldBean> getSignfields() {
		return this.signfields;
	}
	public void setSignfields(List<SignFieldBean> signfields) {
		this.signfields = signfields;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
