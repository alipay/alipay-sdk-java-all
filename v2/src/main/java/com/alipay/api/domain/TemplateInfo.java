package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * E签宝模板信息
 *
 * @author auto create
 * @since 1.0, 2020-05-06 14:36:29
 */
public class TemplateInfo extends AlipayObject {

	private static final long serialVersionUID = 6269845753247453445L;

	/**
	 * 模板填充项
	 */
	@ApiListField("fill_contents")
	@ApiField("fill_content")
	private List<FillContent> fillContents;

	/**
	 * 文件名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 签署区
	 */
	@ApiField("signfields")
	private SignField signfields;

	/**
	 * 模板id
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

	public SignField getSignfields() {
		return this.signfields;
	}
	public void setSignfields(SignField signfields) {
		this.signfields = signfields;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
