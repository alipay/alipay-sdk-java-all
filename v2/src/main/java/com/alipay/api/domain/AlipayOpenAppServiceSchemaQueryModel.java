package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务schema
 *
 * @author auto create
 * @since 1.0, 2023-05-16 16:08:17
 */
public class AlipayOpenAppServiceSchemaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1353964816297883386L;

	/**
	 * 类目id
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 服务模版类型。若当前服务类目只有一个服务模版，可不填。
	 */
	@ApiField("template_type")
	private String templateType;

	public String getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getTemplateType() {
		return this.templateType;
	}
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

}
