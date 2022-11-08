package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.formtemplate.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-21 21:06:56
 */
public class DatadigitalFincloudFinsaasFormtemplateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8142411568833543494L;

	/** 
	 * form_template_id + 唯一 + 页面表单模板查询 + 数据库。
	 */
	@ApiField("form_template_id")
	private String formTemplateId;

	/** 
	 * form_template_json_string + 页面表单模板查询 + 数据库。
	 */
	@ApiField("form_template_json_string")
	private String formTemplateJsonString;

	/** 
	 * form_template_name + 页面表单模板查询 + 数据库。
	 */
	@ApiField("form_template_name")
	private String formTemplateName;

	public void setFormTemplateId(String formTemplateId) {
		this.formTemplateId = formTemplateId;
	}
	public String getFormTemplateId( ) {
		return this.formTemplateId;
	}

	public void setFormTemplateJsonString(String formTemplateJsonString) {
		this.formTemplateJsonString = formTemplateJsonString;
	}
	public String getFormTemplateJsonString( ) {
		return this.formTemplateJsonString;
	}

	public void setFormTemplateName(String formTemplateName) {
		this.formTemplateName = formTemplateName;
	}
	public String getFormTemplateName( ) {
		return this.formTemplateName;
	}

}
