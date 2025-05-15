package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询会员卡领卡投放链接
 *
 * @author auto create
 * @since 1.0, 2025-01-20 16:08:07
 */
public class AlipayUserCardActivateurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6291479882584266652L;

	/**
	 * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
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
