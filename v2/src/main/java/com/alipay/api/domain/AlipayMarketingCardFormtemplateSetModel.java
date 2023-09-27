package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开卡组件表单配置
 *
 * @author auto create
 * @since 1.0, 2023-07-03 13:56:42
 */
public class AlipayMarketingCardFormtemplateSetModel extends AlipayObject {

	private static final long serialVersionUID = 1494316452827149726L;

	/**
	 * "会员卡开卡时的表单字段配置信息，即用户开卡时需填写内容。可定义多个通用表单字段，最大不超过20个。 注意：required和optional，不可以同时为空"
	 */
	@ApiField("fields")
	private OpenFormFieldDO fields;

	/**
	 * 会员卡模板id。调用alipay.marketing.card.template.create（会员卡模板创建接口）创建模板后同步返回。
	 */
	@ApiField("template_id")
	private String templateId;

	public OpenFormFieldDO getFields() {
		return this.fields;
	}
	public void setFields(OpenFormFieldDO fields) {
		this.fields = fields;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
