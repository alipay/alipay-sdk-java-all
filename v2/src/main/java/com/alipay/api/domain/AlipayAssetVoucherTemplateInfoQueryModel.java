package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券模板查询
 *
 * @author auto create
 * @since 1.0, 2026-08-11 14:39:20
 */
public class AlipayAssetVoucherTemplateInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8716913233861485495L;

	/**
	 * 券模版id，传入券模板id后，返回对应的券模版详细信息
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
