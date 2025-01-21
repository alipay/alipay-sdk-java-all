package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegeCardTemplateConfig;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.profile.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-08-08 21:48:59
 */
public class AlipayMerchantPayforprivilegeProfileQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6335339911872981628L;

	/** 
	 * 卡包充值卡面详情模板设置
	 */
	@ApiField("card_template_config")
	private PayForPrivilegeCardTemplateConfig cardTemplateConfig;

	public void setCardTemplateConfig(PayForPrivilegeCardTemplateConfig cardTemplateConfig) {
		this.cardTemplateConfig = cardTemplateConfig;
	}
	public PayForPrivilegeCardTemplateConfig getCardTemplateConfig( ) {
		return this.cardTemplateConfig;
	}

}
