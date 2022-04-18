package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云店券模版信息
 *
 * @author auto create
 * @since 1.0, 2022-03-16 15:39:50
 */
public class YunTaskVoucherTemplateInfo extends AlipayObject {

	private static final long serialVersionUID = 7183393784492177583L;

	/**
	 * 券模版id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券模版名称
	 */
	@ApiField("voucher_name")
	private String voucherName;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getVoucherName() {
		return this.voucherName;
	}
	public void setVoucherName(String voucherName) {
		this.voucherName = voucherName;
	}

}
