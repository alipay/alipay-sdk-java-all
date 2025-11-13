package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询卡模版
 *
 * @author auto create
 * @since 1.0, 2025-10-13 12:23:01
 */
public class AlipayUserCardTemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2421721963398955798L;

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
