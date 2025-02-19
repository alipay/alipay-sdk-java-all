package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品模板启用请求
 *
 * @author auto create
 * @since 1.0, 2022-09-26 11:18:37
 */
public class AlipayMsaasMediarecogMmtcaftscvTemplateApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2513947314269896998L;

	/**
	 * 模板编号
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
