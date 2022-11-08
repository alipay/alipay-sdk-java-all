package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 表单模板与营销类型关联关系
 *
 * @author auto create
 * @since 1.0, 2022-07-21 21:07:27
 */
public class FormTemplateRelationDTO extends AlipayObject {

	private static final long serialVersionUID = 5246228893627275338L;

	/**
	 * form_template_id + 关联关系查询 + 数据库。
	 */
	@ApiField("form_template_id")
	private String formTemplateId;

	/**
	 * form_template_name + 关联关系查询 + 数据库。
	 */
	@ApiField("form_template_name")
	private String formTemplateName;

	/**
	 * gmt_create + 关联关系查询 + 数据库。
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * gmt_modified + 关联关系查询 + 数据库。
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * id + 唯一 + 关联关系查询 + 数据库。
	 */
	@ApiField("id")
	private String id;

	/**
	 * marketing_type + 关联关系查询 + 数据库。
	 */
	@ApiField("marketing_type")
	private String marketingType;

	public String getFormTemplateId() {
		return this.formTemplateId;
	}
	public void setFormTemplateId(String formTemplateId) {
		this.formTemplateId = formTemplateId;
	}

	public String getFormTemplateName() {
		return this.formTemplateName;
	}
	public void setFormTemplateName(String formTemplateName) {
		this.formTemplateName = formTemplateName;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getMarketingType() {
		return this.marketingType;
	}
	public void setMarketingType(String marketingType) {
		this.marketingType = marketingType;
	}

}
