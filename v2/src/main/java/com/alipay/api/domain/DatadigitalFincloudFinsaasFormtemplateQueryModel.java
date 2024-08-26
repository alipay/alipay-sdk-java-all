package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 页面表单模板查询
 *
 * @author auto create
 * @since 1.0, 2022-07-21 21:06:47
 */
public class DatadigitalFincloudFinsaasFormtemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5338922149198765665L;

	/**
	 * form_template_id + 唯一 + 表单模板查询 + 批量查询接口会返回该值。
	 */
	@ApiField("form_template_id")
	private String formTemplateId;

	public String getFormTemplateId() {
		return this.formTemplateId;
	}
	public void setFormTemplateId(String formTemplateId) {
		this.formTemplateId = formTemplateId;
	}

}
