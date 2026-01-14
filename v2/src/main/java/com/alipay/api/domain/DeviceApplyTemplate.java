package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机具设备模板
 *
 * @author auto create
 * @since 1.0, 2018-10-09 11:55:09
 */
public class DeviceApplyTemplate extends AlipayObject {

	private static final long serialVersionUID = 2657789728926276233L;

	/**
	 * 实际申请数量，取值1到500之间，最多不能超过500。补充说明：一次能申请的机具模板种类最多为10，也就是device_list大小为10
	 */
	@ApiField("apply_amount")
	private Long applyAmount;

	/**
	 * 机具模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public Long getApplyAmount() {
		return this.applyAmount;
	}
	public void setApplyAmount(Long applyAmount) {
		this.applyAmount = applyAmount;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
