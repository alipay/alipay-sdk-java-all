package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务schema
 *
 * @author auto create
 * @since 1.0, 2023-11-29 13:11:46
 */
public class AlipayOpenAppServiceSchemaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6281665572216392367L;

	/**
	 * 类目id, 获取请参考<a href="https://opendocs.alipay.com/mini/03ci0w?pathHash=ed3c875c">各个行业场景服务接入资料</a>
	 */
	@ApiField("category_id")
	private String categoryId;

	/**
	 * 服务模版类型，默认值:DEFAULT
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
