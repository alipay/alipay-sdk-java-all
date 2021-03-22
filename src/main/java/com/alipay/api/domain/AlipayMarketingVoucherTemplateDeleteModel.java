package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除资金券模板
 *
 * @author auto create
 * @since 1.0, 2021-02-27 20:26:04
 */
public class AlipayMarketingVoucherTemplateDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4777558476366251311L;

	/**
	 * 券模板ID
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
