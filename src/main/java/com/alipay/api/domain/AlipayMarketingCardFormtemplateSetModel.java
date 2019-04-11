package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开卡组件表单配置
 *
 * @author auto create
 * @since 1.0, 2018-10-15 15:19:55
 */
public class AlipayMarketingCardFormtemplateSetModel extends AlipayObject {

	private static final long serialVersionUID = 7571631937736415431L;

	/**
	 * 会员卡开卡时的表单字段配置信息，可定义多个通用表单字段，最大不超过20个。
	 */
	@ApiField("fields")
	private OpenFormFieldDO fields;

	/**
	 * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
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
