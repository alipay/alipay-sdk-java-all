package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡等级配置查询
 *
 * @author auto create
 * @since 1.0, 2022-11-04 10:32:20
 */
public class AlipayUserCardLevelQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5626864857184141889L;

	/**
	 * template_id：卡模版id，为alipay.user.card.template.create接口返回的模版id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
