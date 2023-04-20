package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序有礼活动查询接口
 *
 * @author auto create
 * @since 1.0, 2019-10-29 11:07:49
 */
public class AlipayOpenMiniActivityGiftQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8791658164612626546L;

	/**
	 * 小程序活动id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 券跳转地址类型
	 */
	@ApiField("voucher_jump_type")
	private String voucherJumpType;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getVoucherJumpType() {
		return this.voucherJumpType;
	}
	public void setVoucherJumpType(String voucherJumpType) {
		this.voucherJumpType = voucherJumpType;
	}

}
